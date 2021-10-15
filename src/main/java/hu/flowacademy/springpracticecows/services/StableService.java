package hu.flowacademy.springpracticecows.services;

import hu.flowacademy.springpracticecows.repositories.StableRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StableService {
    private final StableRepository stableRepository;
}
