package com.zisal.product.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 2/18/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductConverter productConverter;

    @GetMapping("/products")
    public List<ProductDTO> getAllProducts() {
        return productConverter.mapEntitiesIntoDTOs(productRepository.findAll());
    }

    @GetMapping("/product/{id}")
    public ProductDTO getProduct(@PathVariable("id") String p_Id) {
        return productConverter.mapEntityIntoDTO(productRepository.findOne(p_Id));
    }
}
