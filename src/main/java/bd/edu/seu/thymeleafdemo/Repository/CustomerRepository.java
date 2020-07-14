package bd.edu.seu.thymeleafdemo.Repository;

import bd.edu.seu.thymeleafdemo.model.CalendarUtil;
import bd.edu.seu.thymeleafdemo.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepository {
    private static final CustomerRepository INSTANCE = new CustomerRepository();
    private Map<Integer, Customer> customersById;

    public static CustomerRepository getInstance(){
        return INSTANCE;
    }

    private CustomerRepository(){
        customersById = new LinkedHashMap<Integer, Customer>();
        Customer customer = new Customer();
        customer.setId(Integer.valueOf(1));
        customer.setName("James Cucumer");
        customer.setCustomerSince(CalendarUtil.calendarFor(2006, 4, 2, 13, 20));
        customersById.put(customer.getId(), customer);
    }

    public List<Customer> findAll(){
        return new ArrayList<Customer>(customersById.values());
    }

    public Customer findById(Integer id){
        return customersById.get(id);
    }
}
