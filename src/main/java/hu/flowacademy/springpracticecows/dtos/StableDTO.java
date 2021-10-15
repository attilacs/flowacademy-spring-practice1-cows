package hu.flowacademy.springpracticecows.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class StableDTO {
    @NotNull
    private String address;
}
