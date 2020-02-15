package com.dataprocessing.farmdata.Controller;

import com.dataprocessing.farmdata.Model.PotatoFarm;
import com.dataprocessing.farmdata.Repository.PotatoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class PotatoController {
    @Autowired
    private PotatoRepo potatoRepo;

    @PostMapping(path = "/potato")
    public @ResponseBody
    String addPotatoData(@RequestParam double humidity, double temperature, double soilAcidity, double lightIntensity, String date) {
        PotatoFarm potatoFarm = new PotatoFarm(humidity, temperature, soilAcidity, lightIntensity, date);
        potatoRepo.save(potatoFarm);
        return "Data Saved!";
    }

    @GetMapping(path = "/potato",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public @ResponseBody
    Iterable<PotatoFarm> getPotatoData() {
        return potatoRepo.findAll();
    }

    @GetMapping(path = "/potato/{id}",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public @ResponseBody
    Optional<PotatoFarm> getSpecificPotato(@PathVariable Long id) {
        return potatoRepo.findById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/potato/{id}")
    public void deletePotatoData(@PathVariable Long id) {
        potatoRepo.deleteById(id);
    }

    @PutMapping(path = "/potato/{id}")
    public Optional<PotatoFarm> updatePotatoData(@PathVariable Long id, @RequestParam double humidity, double temperature, double soilAcidity, double lightIntensity, String date) {
        return potatoRepo.findById(id)
                .map(potatoFarm -> {
                    potatoFarm.setHumidity(humidity);
                    potatoFarm.setTemperature(temperature);
                    potatoFarm.setSoilAcidity(soilAcidity);
                    potatoFarm.setLightIntensity(lightIntensity);
                    potatoFarm.setDate(date);
                    return potatoRepo.save(potatoFarm);
                });
    }
}
