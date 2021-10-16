package hu.flowacademy.springpracticecows.controllers;

import hu.flowacademy.springpracticecows.services.CowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cow")
@AllArgsConstructor
public class CowController {
    private final CowService cowService;
}
