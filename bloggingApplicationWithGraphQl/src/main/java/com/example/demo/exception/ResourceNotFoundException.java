package com.example.demo.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class ResourceNotFoundException extends RuntimeException {
    private  String resourceName;
    private  String  fileName;
    private  long fieldValue;

    public ResourceNotFoundException(String resourceName, String fileName, long fieldValue) {
        super(String.format("%s  is not found %s:%S",resourceName,fileName,fieldValue));
        this.resourceName = resourceName;
        this.fileName = fileName;
        this.fieldValue = fieldValue;
    }
}
