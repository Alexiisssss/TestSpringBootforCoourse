package com.example.customerdemo.service;

import com.example.customerdemo.model.Customer;
import com.example.customerdemo.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getById(Long id) {
        log.info("IN CustomerServiceImpl getById {}",id);
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl save {}",customer);
        customerRepository.save(customer);

    }

    @Override
    public void delete(Long id) {
        log.info("IN CustomerServiceImpl delete{}",id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl getAlL");
        return customerRepository.findAll();
    }
}
