package com.george.blog.controller;

import com.george.blog.pojo.ResultVO;
import com.george.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 标签controller
 * @author georgeLin
 * @date 2022-01-17-21:55
 */
@RestController
@RequestMapping("categorys")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public ResultVO listCategory() {
        return categoryService.findAll();
    }
}
