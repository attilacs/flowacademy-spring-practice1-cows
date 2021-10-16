package hu.flowacademy.springpracticecows.controllers;

import hu.flowacademy.springpracticecows.model.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorModel notValidArgument() {
        ErrorModel error = new ErrorModel();
        error.setMessage("Érvénytelen bemenet");
        return error;
    }
}
