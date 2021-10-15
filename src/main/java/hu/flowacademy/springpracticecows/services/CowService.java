package hu.flowacademy.springpracticecows.services;

import hu.flowacademy.springpracticecows.repositories.CowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CowService {
    private final CowRepository cowRepository;
}
