package hu.flowacademy.springpracticecows.repositories;

import hu.flowacademy.springpracticecows.entities.Stable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StableRepository extends JpaRepository<Stable, Long> {
}
