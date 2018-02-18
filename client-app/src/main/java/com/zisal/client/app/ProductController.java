package com.zisal.client.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created on 2/14/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
public class ProductController {

    @Autowired
    private IProductRepository productRepository;

    @RequestMapping("/productList")
    public String accountList(Model model) {
        model.addAttribute("products", productRepository.getAllProducts());
        return "product-list";
    }

    @RequestMapping("/productDetails")
    public String accountDetails(@RequestParam("number") String id, Model model) {
        model.addAttribute("product", productRepository.getProduct(id));
        return "product-details";
    }
}
