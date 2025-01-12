package org.jtgm.sys.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class GenericServiceErrorException extends RuntimeException{

    public GenericServiceErrorException(String mes, Throwable cause){
        super(mes, cause);
    }
}

