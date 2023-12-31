package com.web.springboot.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "jerry"),
                new Course(2, "LearnWeb", "jerry"),
                new Course(3, "LearnDocker", "himanshu"),
                new Course(4, "LearnML", "raju")
        );
    }
}
