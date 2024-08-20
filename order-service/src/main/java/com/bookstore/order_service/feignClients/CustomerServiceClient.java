package com.bookstore.order_service.feignClients;

import com.bookstore.order_service.dto.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
public interface CustomerServiceClient {

    @GetMapping("/api/customers/{id}")
    Customer getCustomerById(@PathVariable long id);
}
