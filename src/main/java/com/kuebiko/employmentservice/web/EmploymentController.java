package com.kuebiko.employmentservice.web;

import com.kuebiko.employmentservice.models.Employment;
import com.kuebiko.employmentservice.service.EmploymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/employment")
public class EmploymentController {

    @Autowired
    EmploymentService employmentService;

    @GetMapping
    @RequestMapping("/find")
    public Employment findById(@RequestParam("id")Long id) {
        return employmentService.find(id);
    }

    @GetMapping
    @RequestMapping("/{id}/find")
    public Employment find(@PathVariable("id")Long id) {
        return employmentService.find(id);
    }

    @PostMapping
    @RequestMapping("/save")
    public Employment find(@RequestBody Employment payload) throws Exception {
        return employmentService.save(payload);
    }
}
