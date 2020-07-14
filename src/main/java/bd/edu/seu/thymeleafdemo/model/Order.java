package bd.edu.seu.thymeleafdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private Calendar date;
    private Customer customer;
    private Set<OrderLine> orderLines; // = new LinkedHasSet<OrderLine>();
}
