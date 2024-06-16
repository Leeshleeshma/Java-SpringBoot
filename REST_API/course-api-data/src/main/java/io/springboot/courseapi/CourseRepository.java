package io.springboot.courseapi;
import java.util.List;
import io.springboot.courseapidata.Topic;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);
}
