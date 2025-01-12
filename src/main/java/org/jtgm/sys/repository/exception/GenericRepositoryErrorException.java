package org.jtgm.sys.repository.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class GenericRepositoryErrorException extends RuntimeException{

    public GenericRepositoryErrorException(String mes, Throwable cause){
        super(mes, cause);
    }
}

