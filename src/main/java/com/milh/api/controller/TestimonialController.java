package com.milh.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milh.api.entity.Testimonial;
import com.milh.api.repository.TestimonialRepository;

@RestController
@RequestMapping("/api/testimonials")
@CrossOrigin(origins = "http://127.0.0.1:5500") // Replace with your frontend URL
public class TestimonialController {

    @Autowired
    private TestimonialRepository testimonialRepository;

    @GetMapping
    public List<Testimonial> getAllTestimonials() {
        return testimonialRepository.findAll();
    }

    @PostMapping
    public Testimonial addTestimonial(@RequestBody Testimonial testimonial) {
        return testimonialRepository.save(testimonial);
    }
}
