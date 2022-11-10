package com.example.demo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.Entities.BankLevel;
import com.example.demo.service.BankLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryResolver implements GraphQLQueryResolver {
    @Autowired
    private BankLevelService bankLevelService;

    public List<BankLevel> getAll() {
        return this.bankLevelService.getAll();
    }

    public BankLevel getWriteOff(String policycode) {
        return this.bankLevelService.getOneWriteOff(policycode);
    }
}
