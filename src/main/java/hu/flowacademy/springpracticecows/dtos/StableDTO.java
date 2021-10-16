package hu.flowacademy.springpracticecows.dtos;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class StableDTO {
    @NotEmpty
    private String address;
}
