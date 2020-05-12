package kg.itacademy.jqueryFront.service;

import kg.itacademy.jqueryFront.entity.City;
import kg.itacademy.jqueryFront.repo.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    @Autowired
    private CityRepo cityRepo;

    public List<City> getAll() {
        return cityRepo.findAll();
    }

    public City save(City city) {
        return cityRepo.save(city);
    }

    public City getById(Long id) {
        Optional<City> city = cityRepo.findById(id);
        return city.orElse(new City());
    }
}
