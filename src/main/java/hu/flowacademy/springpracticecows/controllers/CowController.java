package hu.flowacademy.springpracticecows.controllers;

import hu.flowacademy.springpracticecows.dtos.CowDTO;
import hu.flowacademy.springpracticecows.services.CowService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/cow")
@AllArgsConstructor
public class CowController {
    private final CowService cowService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CowDTO addCow(@RequestBody @Valid CowDTO cowDTO) {
        return cowService.addCow(cowDTO);
    }
}
