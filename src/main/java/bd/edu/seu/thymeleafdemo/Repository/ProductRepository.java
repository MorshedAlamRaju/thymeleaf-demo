package bd.edu.seu.thymeleafdemo.Repository;

import bd.edu.seu.thymeleafdemo.model.Comment;
import bd.edu.seu.thymeleafdemo.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository{
    private  Map<Integer, Product> productList;
    private static final ProductRepository INSTANCE = new ProductRepository();

    public static ProductRepository getInstance(){
        return INSTANCE;
    }

    private ProductRepository(){
        productList = new LinkedHashMap<Integer, Product>();
        final Comment comment = new Comment(1, "Energetic and Healthy");
        List<Comment> comments = new ArrayList<>();
        comments.add(comment);
        final Product prod = new Product(1, "Fresh Milk", new BigDecimal("1.00"), true, comments);
        productList.put(1, prod);

    }

    public List<Product> findAll(){
        List<Product> products = new ArrayList<>();
        productList.forEach(products::add);
        return products;
    }

    public Product findById(Integer id){
        return productList.get(id);
    }

}
