package kodlamaioNLayeredApp.business;

import kodlamaioNLayeredApp.core.logging.Logger;
import kodlamaioNLayeredApp.dataAccess.CourseDao;
import kodlamaioNLayeredApp.entities.Course;

import java.util.ArrayList;
import java.util.Objects;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    private ArrayList<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, ArrayList<Course> courses) {
        this.loggers = loggers;
        this.courseDao = courseDao;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {



        for (Course cours : courses) {
            if (course.getCourseName().equals(cours.getCourseName())) {
                System.out.println("asdas");
                throw new Exception("Course name can not be same!");
            }

            if (course.getPrice() < 0) {
                throw new Exception("Price can not be smaller than 0!");

            }
        }
        courses.add(course);
        courseDao.add(course);
    }

    public void list(Course course){
        courseDao.list(course);
    }

    public void log(Course course){
        for (Logger logger : loggers) {
            logger.log(course.getCourseName() + " ");
        }
    }


}
