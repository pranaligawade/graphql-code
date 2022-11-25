package com.example.demo.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Data
public class BankLevel {

    @Id

    private String policyCode;
    //@NotEmpty
    //@Size(min = 8,max = 20,message = "pls enter atleast 8 characters")
    //@Pattern(regexp = "[A-Za-z]", message ="pls enter alphabets" )
    private String entity;
    private String entityLevel;
    private String entityCode;
    private String entityName;
    private String bankCode;
    private String bankName;
    private String automaticWriteOffPolicyName;
    private String schemeType;
    private String moduleCode;
    private String effectiveDate;
    private String healthCode;
    private String healthCodeDescription;
    private String dpd;
}
