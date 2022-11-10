package com.example.demo.service;

import com.example.demo.Entities.BankLevel;
import com.example.demo.Repositories.BankLevelrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankLevelService {

    @Autowired
    private BankLevelrepo bankLevelrepo;

    //mutation
    public BankLevel addBankLevel(BankLevel bankLevel) {
        return this.bankLevelrepo.save(bankLevel);
    }

    public BankLevel updateWriteOff(String policycode, BankLevel bankLevel) {
        BankLevel bankLevel1 = this.bankLevelrepo.findById(policycode).orElseThrow(() -> new RuntimeException("not in db"));
        bankLevel1.setBankName(bankLevel.getBankName());
        bankLevel1.setBankCode(bankLevel.getBankCode());
        bankLevel1.setEntityLevel(bankLevel.getEntityLevel());
        bankLevel1.setDpd(bankLevel.getDpd());
        bankLevel1.setEntity(bankLevel.getEntity());
        bankLevel1.setPolicyCode(bankLevel.getPolicyCode());
        bankLevel1.setModuleCode(bankLevel.getModuleCode());
        bankLevel1.setHealthCodeDescription(bankLevel.getHealthCodeDescription());
        bankLevel1.setEntityName(bankLevel.getEntityName());
        bankLevel1.setEntityCode(bankLevel.getEntityCode());
        bankLevel1.setEffectiveDate(bankLevel.getEffectiveDate());
        bankLevel1.setAutomaticWriteOffPolicyName(bankLevel.getAutomaticWriteOffPolicyName());
        bankLevel1.setSchemeType(bankLevel.getSchemeType());
        bankLevel1.setHealthCode(bankLevel.getHealthCode());
        return this.bankLevelrepo.save(bankLevel1);
    }

    public BankLevel deleteData(String policycode) {
        BankLevel bankLevel = this.bankLevelrepo.findById(policycode).orElseThrow(() -> new RuntimeException("not in db"));
        this.bankLevelrepo.deleteById(policycode);
        return bankLevel;
    }

    //query
    public List<BankLevel> getAll() {
        return this.bankLevelrepo.findAll();
    }

    public BankLevel getOneWriteOff(String Id) {
        return this.bankLevelrepo.findById(Id).orElseThrow(() -> new RuntimeException("not in db"));
    }

}
