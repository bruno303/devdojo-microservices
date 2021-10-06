package academy.devdojo.youtube.core.repository;

import academy.devdojo.youtube.core.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
