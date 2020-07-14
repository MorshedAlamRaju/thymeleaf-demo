package bd.edu.seu.thymeleafdemo.Service;

import bd.edu.seu.thymeleafdemo.Repository.CustomerRepository;
import bd.edu.seu.thymeleafdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public Customer findById(Integer id){
        return customerRepository.findById(id);
    }
}
