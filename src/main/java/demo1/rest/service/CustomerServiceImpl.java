package demo1.rest.service;

import demo1.rest.entity.Customer;
import demo1.rest.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    final
    CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getById(Long id) {
        log.info("In CustomerServiceImpl getById{}", id);
        return customerRepository.getReferenceById(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("In CustomerServiceImpl save{}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("In CustomerServiceImpl delete{}", id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("In CustomerServiceImpl getAll");
        return customerRepository.findAll();
    }
}
