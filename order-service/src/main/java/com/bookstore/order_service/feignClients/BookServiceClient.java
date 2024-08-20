package com.bookstore.order_service.feignClients;

import com.bookstore.order_service.dto.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="BOOK-SERVICE")
public interface BookServiceClient {

    @GetMapping("/api/books/{id}")
    Book getBookById(@PathVariable long id);
}
