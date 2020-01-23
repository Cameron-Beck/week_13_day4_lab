package com.example.codeclan.course_booking.repository.courseRepository;

import com.example.codeclan.course_booking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
