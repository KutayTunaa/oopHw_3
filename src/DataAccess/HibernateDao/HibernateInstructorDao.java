package DataAccess.HibernateDao;

import DataAccess.InstructorDao;
import Entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {


    @Override
    public void add(Instructor instructor) {
        System.out.println("eğitmen Hibernate veri tabanına eklendi " + instructor.getInstructorName());
    }

    @Override
    public Instructor[] getAll() {
        return new Instructor[0];
    }
}
