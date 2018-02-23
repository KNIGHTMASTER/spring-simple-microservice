package com.zisal.client.app;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created on 2/18/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@FeignClient(name = "product-api" , fallback = ProductAPIClientFallBack.class/*, fallbackFactory = ProductAPIClientFallBackFactory.class*/)
public interface IProductAPIClient {

    @GetMapping("/products")
    List<ProductDTO> getAllProducts();

    @GetMapping("/product/{id}")
    ProductDTO getProduct(@PathVariable("id") String p_id);
}
