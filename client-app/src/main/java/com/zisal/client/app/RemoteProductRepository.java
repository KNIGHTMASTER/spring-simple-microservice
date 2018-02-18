package com.zisal.client.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 2/13/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class RemoteProductRepository implements IProductRepository {

    @Autowired
    private IProductAPIClient productAPIClient;

    @Override
    public List<ProductDTO> getAllProducts() {
        return productAPIClient.getAllProducts();
    }

    @Override
    public ProductDTO getProduct(String p_Number) {
        return productAPIClient.getProduct(p_Number);
    }
}
