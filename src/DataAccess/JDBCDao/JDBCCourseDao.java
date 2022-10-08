package DataAccess.JDBCDao;

import DataAccess.CourseDao;
import Entities.Course;

public class JDBCCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("kurs JDBC veritabanına eklendi..." + course.getCourseName());
    }

    @Override
    public Course[] getAll() {
        return new Course[0];
    }


}
