package bd.edu.seu.thymeleafdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLine {
    private Product product;
    private Integer amount;
    private BigDecimal purchasePrice;
}
