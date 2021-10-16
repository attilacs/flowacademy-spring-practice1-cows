package hu.flowacademy.springpracticecows.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class CowDTO {
    @Pattern(regexp = "^\\d{3}-\\d{4}-\\d{3}$")
    private String sid;

    @NotNull
    private Integer age;

    @NotNull
    private Long stableId;
}
