package com.qf.qfv9background.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.api.product.IProductService;
import com.qf.v9.entity.TProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @Reference
    private IProductService productService;

    @GetMapping("list")
    public String list(Model model) {
        List<TProduct> list = productService.list();
        model.addAttribute("list", list);
        return "product/list";
    }
}
