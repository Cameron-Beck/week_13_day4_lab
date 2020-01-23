package com.example.codeclan.course_booking.components;

import com.example.codeclan.course_booking.models.Booking;
import com.example.codeclan.course_booking.models.Course;
import com.example.codeclan.course_booking.models.Customer;
import com.example.codeclan.course_booking.repository.bookingRepository.BookingRepository;
import com.example.codeclan.course_booking.repository.courseRepository.CourseRepository;
import com.example.codeclan.course_booking.repository.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course java = new Course("java", "Edinburgh", 5);
        courseRepository.save(java);
        Course javascript = new Course("JavaScript", "Edinburgh", 4);
        courseRepository.save(javascript);
        Course python = new Course("Python", "Glasgow", 4);
        courseRepository.save(python);
        Course ruby = new Course("Ruby", "Inverness", 3);
        courseRepository.save(ruby);

        Customer sophia = new Customer("Sophia", "Edinburgh", 14);
        customerRepository.save(sophia);
        Customer cameron = new Customer("Cameron", "Aberdeen", 52);
        customerRepository.save(cameron);

        Booking booking1 = new Booking("16-07-20", java, sophia);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("16-07-20", python, sophia);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("16-07-20", python, cameron);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("16-07-20", ruby, cameron);
        bookingRepository.save(booking4);

        java.addBooking(booking1);
        python.addBooking(booking2);
        python.addBooking(booking3);
        ruby.addBooking(booking4);

        sophia.addBooking(booking1);
        sophia.addBooking(booking2);
        cameron.addBooking(booking3);
        cameron.addBooking(booking4);




    }


}

