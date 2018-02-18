package com.zisal.product.api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2/18/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class ProductConverter {

    ProductDTO mapEntityIntoDTO(Product p_Product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(p_Product.getId());
        productDTO.setCode(p_Product.getCode());
        productDTO.setName(p_Product.getName());
        productDTO.setRemarks(p_Product.getRemarks());
        return productDTO;
    }

    List<ProductDTO> mapEntitiesIntoDTOs(List<Product> p_Products) {
        List<ProductDTO> result = new ArrayList<>();
        for (Product product : p_Products) {
            result.add(mapEntityIntoDTO(product));
        }
        return result;
    }
}
