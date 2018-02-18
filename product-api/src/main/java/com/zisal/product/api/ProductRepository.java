package com.zisal.product.api;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 2/18/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface ProductRepository extends JpaRepository<Product, String> {
}
