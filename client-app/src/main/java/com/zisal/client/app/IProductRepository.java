package com.zisal.client.app;

import java.util.List;

/**
 * Created on 2/18/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IProductRepository {

    List<ProductDTO> getAllProducts();

    ProductDTO getProduct(String p_Number);
}
