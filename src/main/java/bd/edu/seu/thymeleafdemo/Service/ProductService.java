package bd.edu.seu.thymeleafdemo.Service;


import bd.edu.seu.thymeleafdemo.Repository.ProductRepository;
import bd.edu.seu.thymeleafdemo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        List<Product> productList = new ArrayList<>();
        productRepository.findAll().forEach(productList::add);
        return productList;
    }

    public Product findById(Integer id){
        return productRepository.findById(id);
    }
}
