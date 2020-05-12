package kg.itacademy.jqueryFront.repo;

import kg.itacademy.jqueryFront.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City, Long> {
}
