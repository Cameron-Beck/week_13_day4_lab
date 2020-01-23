package com.example.codeclan.course_booking.repository.customerRepository;

import com.example.codeclan.course_booking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
