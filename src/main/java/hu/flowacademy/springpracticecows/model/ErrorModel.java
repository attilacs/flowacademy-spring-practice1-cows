package hu.flowacademy.springpracticecows.model;

import lombok.Data;

@Data
public class ErrorModel {
    private String message;
    private Object data;
}
