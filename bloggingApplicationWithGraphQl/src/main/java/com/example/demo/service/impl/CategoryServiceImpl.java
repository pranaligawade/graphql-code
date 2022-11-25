package com.example.demo.service.impl;

import com.example.demo.Dto.CatDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Entities.Category;
import com.example.demo.Entities.User;
import com.example.demo.Repositories.CatRepo;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.service.CatService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CatService {
    @Autowired
    private CatRepo catRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public CatDto createCategory(CatDto catDto) {
        Category category=this.modelMapper.map(catDto, Category.class);
        Category category1=this.catRepo.save(category);
        CatDto catDto1=this.modelMapper.map(category1, CatDto.class);
        return  catDto1;
    }

    @Override
    public CatDto updateCategory(CatDto catDto, Integer cat_id) {
        Category category= this.catRepo.findById(cat_id).orElseThrow(()->new ResourceNotFoundException("Category","category id",cat_id));
        category.setCat_id(catDto.getCat_id());
        category.setCat_title(catDto.getCat_title());
        category.setCat_details(catDto.getCat_details());
        Category category1=this.catRepo.save(category);
        return this.modelMapper.map(category1, CatDto.class);
    }

    @Override
    public void deleteCategory(Integer cat_id) {
        Category category= this.catRepo.findById(cat_id).orElseThrow(()->new ResourceNotFoundException("Category","category id",cat_id));
        this.catRepo.delete(category);
    }

    @Override
    public List<CatDto> getAllCategory() {
        List<Category> categories = this.catRepo.findAll();
        return categories.stream().map((categorys) -> this.modelMapper.map(categorys, CatDto.class)).collect(Collectors.toList());
    }

    @Override
    public CatDto getCategory(Integer cat_id) {
        Category category= this.catRepo.findById(cat_id).orElseThrow(()->new ResourceNotFoundException("Category","category Id",cat_id));
        return this.modelMapper.map(category,CatDto.class);

    }
}
