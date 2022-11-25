package com.example.demo.service;

import com.example.demo.Dto.CatDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatService {
    CatDto createCategory(CatDto catDto);

    CatDto updateCategory(CatDto catDto, Integer cat_id);

    void deleteCategory(Integer cat_id);

    List<CatDto> getAllCategory();

    CatDto getCategory(Integer cat_id);

}
