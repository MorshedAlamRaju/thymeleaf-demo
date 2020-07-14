package bd.edu.seu.thymeleafdemo.Service;

import bd.edu.seu.thymeleafdemo.Repository.OrderRepository;
import bd.edu.seu.thymeleafdemo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Integer id){
        return orderRepository.findById(id);
    }

    public List<Order> findByCustomerId(Integer id){
        return orderRepository.findByCustomerId(id);
    }
}
