package hu.flowacademy.springpracticecows.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StableDTO {
    @NotEmpty
    private String address;
}
