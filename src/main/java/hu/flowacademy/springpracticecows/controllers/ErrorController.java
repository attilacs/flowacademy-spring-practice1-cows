package hu.flowacademy.springpracticecows.controllers;

import hu.flowacademy.springpracticecows.model.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorModel notValidArgument() {
        return new ErrorModel("Érvénytelen bemenet", null);
    }

    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorModel illegalArgument(IllegalArgumentException exception) {
        return new ErrorModel(exception.getMessage(), null);
    }

    @ExceptionHandler({NoSuchElementException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorModel notFound(NoSuchElementException exception) {
        return new ErrorModel(exception.getMessage(), null);
    }
}