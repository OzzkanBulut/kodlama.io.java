package kodlamaioNLayeredApp.dataAccess;

import kodlamaioNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName()+" course Added with Hibernate ");
    }
    public void list(Course course){

        System.out.print("\nID:"+ course.getId());
        System.out.print("  Name:"+ course.getCourseName());
        System.out.print("  Category:"+ course.getCategoryName());
        System.out.print("  Instructor:"+ course.getInstructorName());
        System.out.print("  Price:"+ course.getPrice());
    }
}
