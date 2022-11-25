package com.example.demo.resolver.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.Dto.CatDto;
import com.example.demo.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Component
@Validated
public class CatMutation implements GraphQLMutationResolver {
    @Autowired
    private CatService catService;

    public CatDto create_Category(@Valid CatDto catDto) {
        return this.catService.createCategory(catDto);
    }

    public CatDto update_category(@Valid CatDto catDto, Integer cat_id) {
        return this.catService.updateCategory(catDto, cat_id);
    }

    public void delete_Category(Integer cat_id) {
        this.catService.deleteCategory(cat_id);
    }
}
