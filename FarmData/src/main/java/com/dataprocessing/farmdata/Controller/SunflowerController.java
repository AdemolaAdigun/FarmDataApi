package com.dataprocessing.farmdata.Controller;

import com.dataprocessing.farmdata.Model.SunflowerFarm;
import com.dataprocessing.farmdata.Repository.SunflowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SunflowerController {
    @Autowired
    private SunflowerRepo sunflowerRepo;

    @PostMapping(path = "/sun")
    public @ResponseBody
    String addSunflowerData(@RequestParam double humidity, double temperature, double soilAcidity, double lightIntensity, String date) {
        SunflowerFarm sunflowerFarm = new SunflowerFarm(humidity, temperature, soilAcidity, lightIntensity, date);
        sunflowerRepo.save(sunflowerFarm);
        return "Data Saved!";
    }

    @GetMapping(path = "/sun",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public @ResponseBody
    Iterable<SunflowerFarm> getSunflowerData() {
        return sunflowerRepo.findAll();
    }

    @GetMapping(path = "/sun/{id}",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public @ResponseBody
    Optional<SunflowerFarm> getSpecificSunflower(@PathVariable Long id) {
        return sunflowerRepo.findById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/sun/{id}")
    public void deleteSunflowerData(@PathVariable Long id) {
        sunflowerRepo.deleteById(id);
    }

    @PutMapping(path = "/sun/{id}")
    public Optional<SunflowerFarm> updateSunflowerData(@PathVariable Long id, @RequestParam double humidity, double temperature, double soilAcidity, double lightIntensity, String date) {
        return sunflowerRepo.findById(id)
                .map(sunflowerFarm -> {
                    sunflowerFarm.setHumidity(humidity);
                    sunflowerFarm.setTemperature(temperature);
                    sunflowerFarm.setSoilAcidity(soilAcidity);
                    sunflowerFarm.setLightIntensity(lightIntensity);
                    sunflowerFarm.setDate(date);
                    return sunflowerRepo.save(sunflowerFarm);
                });
    }
}
