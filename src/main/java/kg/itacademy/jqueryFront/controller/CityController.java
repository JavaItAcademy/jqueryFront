package kg.itacademy.jqueryFront.controller;

import kg.itacademy.jqueryFront.entity.City;
import kg.itacademy.jqueryFront.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    @PostMapping("/image")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        String fileName = addImage(file);
        return fileName;
    }

    private String addImage(MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        String modifiedFileName = System.currentTimeMillis() + file.getOriginalFilename();
        Path path = Paths.get("C:\\Users\\hatik\\Desktop\\Java\\nginx\\pics\\" + modifiedFileName);
        Files.write(path,bytes);
        return modifiedFileName;
    }
}
