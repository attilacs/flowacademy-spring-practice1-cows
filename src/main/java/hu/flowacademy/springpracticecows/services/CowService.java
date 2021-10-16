package hu.flowacademy.springpracticecows.services;

import hu.flowacademy.springpracticecows.dtos.CowDTO;
import hu.flowacademy.springpracticecows.entities.Cow;
import hu.flowacademy.springpracticecows.entities.Stable;
import hu.flowacademy.springpracticecows.repositories.CowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CowService {
    private final CowRepository cowRepository;
    private final StableService stableService;

    public CowDTO addCow(CowDTO cowDTO) {
        Cow cow = new Cow();
        cow.setAge(cowDTO.getAge());
        cow.setSid(cowDTO.getSid());
        Optional<Stable> stable = stableService.findStableById(cowDTO.getStableId());
        if (stable.isEmpty()) {
            throw new NoSuchElementException("Nincs ilyen istálló");
        }
        cow.setStable(stable.get());
        cowRepository.save(cow);
        return cowDTO;
    }
}
