package com.xworkz.forms.service.product;

import com.xworkz.forms.dto.ProductDTO;
import com.xworkz.forms.entity.ProductEntity;
import com.xworkz.forms.repo.product.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public void save(ProductDTO dto) {
        ProductEntity entity = new ProductEntity();
        BeanUtils.copyProperties(dto, entity);

        repo.save(entity);
    }
}
