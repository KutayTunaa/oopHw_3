import Business.CategoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import Core.Logging.DatabaseLogger;
import Core.Logging.EmailLogger;
import Core.Logging.FileLogger;
import Core.Logging.Logger;
import DataAccess.HibernateDao.HibernateCategoryDao;
import DataAccess.HibernateDao.HibernateCourseDao;
import DataAccess.HibernateDao.HibernateInstructorDao;
import DataAccess.InstructorDao;
import DataAccess.JDBCDao.JDBCCategoryDao;
import DataAccess.JDBCDao.JDBCInstructorDao;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};

        Instructor instructor = new Instructor("Engin" , "Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor);

        Category category = new Category("Backend development");
        List<Category> categories= new ArrayList<>();
        CategoryManager categoryManager = new CategoryManager(categories,new HibernateCategoryDao() ,  loggers);
        categoryManager.add(category);

        Course course = new Course("java geliştirici" , 00, "category 1"  , "Engin Bey");
        List<Course>courses = new ArrayList<>();
        CourseManager courseManager = new CourseManager(courses, new HibernateCourseDao() , loggers);
        courseManager.add(course);




    }


}
