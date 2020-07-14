package bd.edu.seu.thymeleafdemo.Repository;

import bd.edu.seu.thymeleafdemo.model.CalendarUtil;
import bd.edu.seu.thymeleafdemo.model.Customer;
import bd.edu.seu.thymeleafdemo.model.Order;
import bd.edu.seu.thymeleafdemo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrderRepository {
    private static final OrderRepository INSTANCE = new OrderRepository();
    private Map<Integer, Order> orderListById;
    private Map<Integer, List<Order>> orderListByCustomerId;

    public static OrderRepository getInstance(){
        return INSTANCE;
    }

    private OrderRepository(){
        orderListById = new LinkedHashMap<Integer, Order>();
        orderListByCustomerId = new LinkedHashMap<Integer, List<Order>>();

        final Customer customer1 = CustomerRepository.getInstance().findById(Integer.valueOf(1));
        orderListByCustomerId.put(customer1.getId(), new ArrayList<Order>());

        final Product product1 = ProductRepository.getInstance().findById(1);

        final Order order1 = new Order();
        order1.setId(1);
        order1.setCustomer(customer1);
        order1.setDate(CalendarUtil.calendarFor(2009, 1, 12, 10, 23));
        orderListById.put(order1.getId(), order1);
        orderListByCustomerId.get(customer1.getId()).add(order1);

    }

    public List<Order> findAll(){
        return new ArrayList<Order>(orderListById.values());
    }

    public Order findById(Integer id){
        return orderListById.get(id);
    }

    public List<Order> findByCustomerId(Integer id){
        final List<Order> ordersForCustomerId = orderListByCustomerId.get(id);
        if(ordersForCustomerId == null){
            return new ArrayList<Order>();
        }
        return ordersForCustomerId;
    }

}
