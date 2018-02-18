package com.zisal.client.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2/18/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class IProductAPIClientFallBack implements IProductAPIClient {


    @Override
    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> productDTOs = new ArrayList<>();
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId("12345");
        productDTO.setCode("PRDXXX");
        productDTO.setName("Product FallBack");
        productDTO.setRemarks("Example Response from FallBack");
        productDTOs.add(productDTO);
        return productDTOs;
    }

    @Override
    public ProductDTO getProduct(String p_id) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId("12345");
        productDTO.setCode("PRDXXX");
        productDTO.setName("Product FallBack");
        productDTO.setRemarks("Example Response from FallBack");
        return productDTO;
    }
}
