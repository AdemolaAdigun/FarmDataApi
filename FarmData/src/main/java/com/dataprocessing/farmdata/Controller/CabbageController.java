package com.dataprocessing.farmdata.Controller;

import com.dataprocessing.farmdata.Model.CabbageFarm;
import com.dataprocessing.farmdata.Repository.CabbageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CabbageController {
    @Autowired

    private CabbageRepo cabbageRepo;

    @PostMapping(path = "/cabbage")
    public @ResponseBody
    String addCabbageData(@RequestParam double humidity, double temperature, double soilAcidity, double lightIntensity, String date) {
        CabbageFarm cabbageFarm = new CabbageFarm(humidity, temperature, soilAcidity, lightIntensity, date);
        cabbageRepo.save(cabbageFarm);
        return "Data Saved!";
    }

    @GetMapping(path = "/cabbage",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE,
            })
    public @ResponseBody
    Iterable<CabbageFarm> getCabbageData() {
        return cabbageRepo.findAll();
    }

    @GetMapping(path = "/cabbage/{id}",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public @ResponseBody
    Optional<CabbageFarm> getSpecificCabbage(@PathVariable Long id) {
        return cabbageRepo.findById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/cabbage/{id}")
    public void deleteCabbageData(@PathVariable Long id) {
        cabbageRepo.deleteById(id);
    }

    @PutMapping(path = "/cabbage/{id}")
    public Optional<CabbageFarm> updateCabbageData(@PathVariable Long id, @RequestParam double humidity, double temperature, double soilAcidity, double lightIntensity, String date) {
        return cabbageRepo.findById(id)
                .map(cabbageFarm -> {
                    cabbageFarm.setHumidity(humidity);
                    cabbageFarm.setTemperature(temperature);
                    cabbageFarm.setSoilAcidity(soilAcidity);
                    cabbageFarm.setLightIntensity(lightIntensity);
                    cabbageFarm.setDate(date);
                    return cabbageRepo.save(cabbageFarm);
                });
    }
}
