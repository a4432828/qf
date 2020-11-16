package com.qf.qfv9background.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.api.product.IProductTypeService;
import com.qf.v9.entity.TProductType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("productType")
public class ProductTypeController {

    @Reference
    private IProductTypeService iProductTypeService;

    @GetMapping("list")
    public List<TProductType> list() {
        return iProductTypeService.list();
    }
}
