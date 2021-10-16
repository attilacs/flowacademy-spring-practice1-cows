package hu.flowacademy.springpracticecows.services;

import hu.flowacademy.springpracticecows.dtos.StableDTO;
import hu.flowacademy.springpracticecows.entities.Stable;
import hu.flowacademy.springpracticecows.repositories.StableRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class StableService {
    private final StableRepository stableRepository;

    public Stable addStable(StableDTO stableDTO) {
        Stable stable = new Stable();
        stable.setAddress(stableDTO.getAddress());
        stable.setCows(new ArrayList<>());
        return stableRepository.save(stable);
    }

    public void checkIfStableAddressAlreadyExists(StableDTO stableDTO) {
        if (stableRepository
                .findAll()
                .stream()
                .anyMatch(stable -> stable.getAddress().equalsIgnoreCase(stableDTO.getAddress()))) {
            throw new IllegalArgumentException("A megadott cím már létezik!");
        }
    }
}
