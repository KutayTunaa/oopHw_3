package DataAccess.JDBCDao;

import DataAccess.InstructorDao;
import Entities.Instructor;

public class JDBCInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen JDBC veritabanına eklendi..." + instructor.getInstructorName());
    }

    @Override
    public Instructor[] getAll() {
        return new Instructor[0];
    }
}
