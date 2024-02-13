package com.milh.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milh.api.entity.Testimonial;

public interface TestimonialRepository extends JpaRepository<Testimonial, Long> {
}
