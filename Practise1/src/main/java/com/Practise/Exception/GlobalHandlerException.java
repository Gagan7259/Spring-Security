package com.Practise.Exception;

import com.Practise.PayLoad.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlerException {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> GlobalHandlerException(ResourceNotFoundException re) {
        String message = re.getMessage();
        ApiResponse response = ApiResponse.builder().message(message).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
