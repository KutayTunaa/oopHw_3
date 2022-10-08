package DataAccess;

import Entities.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    Course[] getAll();

    }


