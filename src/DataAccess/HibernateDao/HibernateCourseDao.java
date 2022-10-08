package DataAccess.HibernateDao;

import DataAccess.CategoryDao;
import DataAccess.CourseDao;
import Entities.Category;
import Entities.Course;

public class HibernateCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println("kurs Hibernate veri tabanına eklendi..." + course.getCourseName());
    }

    @Override
    public Course[] getAll() {
        return new Course[0];
    }
}