package kodlamaioNLayeredApp;


import kodlamaioNLayeredApp.business.CategoryManager;
import kodlamaioNLayeredApp.business.CourseManager;
import kodlamaioNLayeredApp.core.logging.DatabaseLogger;
import kodlamaioNLayeredApp.core.logging.FileLogger;
import kodlamaioNLayeredApp.core.logging.Logger;
import kodlamaioNLayeredApp.core.logging.MailLogger;
import kodlamaioNLayeredApp.dataAccess.CourseDao;
import kodlamaioNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaioNLayeredApp.dataAccess.JdbcCourseDao;
import kodlamaioNLayeredApp.entities.Category;
import kodlamaioNLayeredApp.entities.Course;
import kodlamaioNLayeredApp.entities.Instructor;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Category> categories = new ArrayList<>();
        ArrayList<Instructor> instructors = new ArrayList<>();

        Category category1 = new Category(1, "Programming");
        Category category2 = new Category(2,"Computer Science");

        Instructor instructor1 = new Instructor(1, "Engin Demiroğ");
        Instructor instructor2 = new Instructor(2,"Şadi Evren Şeker");

        Course course1 = new Course(1, "Java", instructor1.getInstructorName(), category1.getCategoryName(), 100);
        Course course2 = new Course(2,"C++", instructor2.getInstructorName(), category2.getCategoryName(), 123);

        CategoryManager categoryManager = new CategoryManager(categories);
        categoryManager.addCategory(category1);
        categoryManager.addCategory(category2);


        CourseManager courseManager1 = new CourseManager(new HibernateCourseDao(), loggers, courses);
        courseManager1.add(course1);

        CourseManager courseManager2 = new CourseManager(new JdbcCourseDao(),loggers,courses);
        courseManager2.add(course2);

//      courseManager1.add(course1); throws an exception because this course already exists
//      categoryManager.addCategory(category1); throws an exception because this category already exists

        courseManager1.list(course1);
        courseManager2.list(course2);

        courseManager1.log(course1);
        courseManager2.log(course2);

    }
}