package Business;

import Core.Logging.Logger;
import DataAccess.CourseDao;
import Entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(List<Course> courses, CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        for (Course courses : courseDao.getAll()) {
            if (course.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Kurs ismi aynı olamaz ! " + course.getCourseName());
            }
            if (course.getPrice() < 0) {
                throw new Exception("Kursun ücreti 0 olamaz!!! ");
            }
        }
            courseDao.add(course);
                for (Logger logger : loggers) {
                logger.log(course.getCourseName());
            }
        }
    }

