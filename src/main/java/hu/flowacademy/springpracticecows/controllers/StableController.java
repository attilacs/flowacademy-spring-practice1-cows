package hu.flowacademy.springpracticecows.controllers;

import hu.flowacademy.springpracticecows.dtos.StableDTO;
import hu.flowacademy.springpracticecows.services.StableService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/stable")
@AllArgsConstructor
public class StableController {
    private final StableService stableService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StableDTO addStable(@RequestBody @Valid StableDTO stableDTO) {
        stableService.checkIfStableAddressAlreadyExists(stableDTO);
        stableService.addStable(stableDTO);
        return stableDTO;
    }
}
