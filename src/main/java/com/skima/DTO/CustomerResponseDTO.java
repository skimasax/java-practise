package com.skima.DTO;

import com.skima.model.Customer;

public class CustomerResponseDTO {
    private boolean status;
    private String message;
    private Customer customer;

    public CustomerResponseDTO(boolean status, String message, Customer customer) {
        this.status=status;
        this.message=message;
        this.customer = customer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
