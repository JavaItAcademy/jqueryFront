package kg.itacademy.jqueryFront.controller;

import kg.itacademy.jqueryFront.entity.City;
import kg.itacademy.jqueryFront.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @CrossOrigin
    @GetMapping("/all")
    public List<City> getAll (){
        return cityService.getAll();
    }

    @CrossOrigin
    @PostMapping
    public City save(@RequestBody City city) {
        return cityService.save(city);
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public City getById(@PathVariable("id") Long id) {
        return cityService.getById(id);
    }
}
