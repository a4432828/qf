package com.qf.qfv9productservice.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.api.product.IProductService;
import com.qf.v9.common.basic.BaseServiceImpl;
import com.qf.v9.common.basic.IBaseDao;
import com.qf.v9.entity.TProduct;
import com.qf.v9.mapper.TProductMapper;
import com.qf.v9.mapper.TProductTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class ProductService extends BaseServiceImpl<TProduct> implements IProductService {
    @Autowired
    private TProductMapper productMapper;

    @Override
    public IBaseDao<TProduct> getBaseDao() {
        return productMapper;
    }
}
