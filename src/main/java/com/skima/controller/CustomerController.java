package com.skima.controller;

import com.skima.DTO.DataResponseDTO;
import com.skima.Service.CustomerService;
import com.skima.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public DataResponseDTO<Customer> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return new DataResponseDTO(true,"customers fetched successfully",customers);
    }

    @PostMapping
    public ResponseEntity<DataResponseDTO<Customer>> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.createCustomer(customer);
        DataResponseDTO<Customer> responseDTO = new DataResponseDTO<>(true, "Customer created successfully", savedCustomer);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataResponseDTO<Customer>> singleCustomer(@PathVariable Integer id) {
        Optional<Customer> customer = customerService.getCustomerById(id);
        if (customer.isPresent()) {
            DataResponseDTO<Customer> responseDTO = new DataResponseDTO<>(true, "Customer fetched successfully", customer.get());
            return ResponseEntity.ok(responseDTO);
        } else {
            DataResponseDTO<Customer> responseDTO = new DataResponseDTO<>(false, "Customer not found", null);
            return ResponseEntity.status(404).body(responseDTO);
        }
    }


}
