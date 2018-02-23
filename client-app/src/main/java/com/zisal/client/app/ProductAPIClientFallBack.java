package com.zisal.client.app;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2/18/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class ProductAPIClientFallBack implements IProductAPIClient {

   /* private final Throwable cause;

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductAPIClientFallBack.class);

    public ProductAPIClientFallBack(Throwable cause) {
        this.cause = cause;
    }*/


    @Override
    public List<ProductDTO> getAllProducts() {
        /*if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            LOGGER.info("CAUSE "+cause.getMessage());
        }*/
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
/*        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            LOGGER.info("CAUSE SINGLE "+cause.getMessage());
        }*/
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId("12345");
        productDTO.setCode("PRDXXX");
        productDTO.setName("Product FallBack");
        productDTO.setRemarks("Example Response from FallBack");
        return productDTO;
    }
}
