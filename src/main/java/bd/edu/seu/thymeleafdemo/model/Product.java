package bd.edu.seu.thymeleafdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private BigDecimal price;
    private Boolean inStock;
    private List<Comment> comments; // = new ArrayList<Comment>();
}
