package in.ac.charusat.studentmgmtsystem.repository;

import in.ac.charusat.studentmgmtsystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courseRepository extends JpaRepository<Course, Integer> {

}
