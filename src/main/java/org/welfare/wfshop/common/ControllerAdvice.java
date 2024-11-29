package org.welfare.wfshop.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.welfare.wfshop.exception.ErrorResponse;

@Slf4j
@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleException(Exception e) {
        log.error("Exception: ", e);
        return new ErrorResponse("INTERNAL_SERVER_ERROR");
    }

}
