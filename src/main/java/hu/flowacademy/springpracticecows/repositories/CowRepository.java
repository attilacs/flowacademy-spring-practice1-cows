package hu.flowacademy.springpracticecows.repositories;

import hu.flowacademy.springpracticecows.entities.Cow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CowRepository extends JpaRepository<Cow, Long> {
}
