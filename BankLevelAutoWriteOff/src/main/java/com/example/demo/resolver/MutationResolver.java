package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.Entities.BankLevel;
import com.example.demo.service.BankLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MutationResolver implements GraphQLMutationResolver {

    @Autowired
    private BankLevelService bankLevelService;

    public BankLevel addData(BankLevel bankLevel) {
        return this.bankLevelService.addBankLevel(bankLevel);
    }

    public BankLevel updateData(String policy_code, BankLevel bankLevel) {
        return this.bankLevelService.updateWriteOff(policy_code, bankLevel);
    }

    public BankLevel deleteData(String policy_Code) {
        return this.bankLevelService.deleteData(policy_Code);
    }
}
