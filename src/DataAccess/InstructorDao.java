package DataAccess;

import Entities.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);
        Instructor[] getAll();
}
