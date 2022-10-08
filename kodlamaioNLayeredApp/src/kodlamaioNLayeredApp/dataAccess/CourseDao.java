package kodlamaioNLayeredApp.dataAccess;

import kodlamaioNLayeredApp.entities.Course;

public interface CourseDao {
    void add(Course course);
    void list(Course course);
}
