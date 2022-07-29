package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseController {
    @Autowired
    in.ac.charusat.studentmgmtsystem.repository.courseRepository courseRepository;
     List<Course> course = new ArrayList<>(
           Arrays.asList(
                   new Course(1, "Tom", "US"),
                   new Course(2, "Harry", "Canada"),
                   new Course(3, "Nick", "UK")
           )
    );

    //Get the course information
    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable Integer id){
        return courseRepository.findById(id).get();
    }

    //Get the list of all course
    @GetMapping("/listcourses")
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    @PostMapping("/course")
    public List<Course> addCourse(@RequestBody Course course) {
        courseRepository.save(course);
        return courseRepository.findAll();
    }

    @PutMapping("/course/{id}")
    public List<Course> updateCourse(@RequestBody Course course, @PathVariable Integer id) {
        Course courseObj = courseRepository.findById(id).get();
        courseObj.setTitle(course.getTitle());
        courseObj.setDescription(course.getDescription());
        courseRepository.save(courseObj);
        return courseRepository.findAll();
    }

    @DeleteMapping("/course/{id}")
    public List<Course> deleteCourse(@PathVariable Integer id) {
        courseRepository.delete(courseRepository.findById(id).get());
        return courseRepository.findAll();
    }
}
