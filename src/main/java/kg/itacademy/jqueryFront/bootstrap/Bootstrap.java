package kg.itacademy.jqueryFront.bootstrap;

import kg.itacademy.jqueryFront.entity.City;
import kg.itacademy.jqueryFront.repo.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    private CityRepo cityRepo;

    @Override
    public void run(String... args) throws Exception {
        City cityBishkek = City.builder()
                .name("Bishkek")
                .build();
        cityRepo.save(cityBishkek);

        City cityOsh = City.builder()
                .name("Osh")
                .build();
        cityRepo.save(cityOsh);

        City cityKarakol = City.builder()
                .name("Karakol")
                .build();
        cityRepo.save(cityKarakol);
    }
}
