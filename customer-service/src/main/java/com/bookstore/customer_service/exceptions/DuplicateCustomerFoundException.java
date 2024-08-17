package com.bookstore.customer_service.exceptions;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class DuplicateCustomerFoundException extends RuntimeException {
    public DuplicateCustomerFoundException(@NotNull @Size(min = 1, max = 255) String s) {
        super(s);
    }
}
