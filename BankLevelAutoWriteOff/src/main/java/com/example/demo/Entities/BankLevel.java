package com.example.demo.Entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class BankLevel {

    @Id
    private String policyCode;
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
