package hu.flowacademy.springpracticecows.controllers;

import hu.flowacademy.springpracticecows.services.StableService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/stable")
@AllArgsConstructor
public class StableController {
    private final StableService stableService;
}
