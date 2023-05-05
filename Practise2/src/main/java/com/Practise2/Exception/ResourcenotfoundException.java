package com.Practise2.Exception;

public class ResourcenotfoundException extends RuntimeException {
    public ResourcenotfoundException(String e){
        super(e);
    }
    public ResourcenotfoundException( ){
        super(" ooops!!!!!! Resource Not Found");
    }
}
