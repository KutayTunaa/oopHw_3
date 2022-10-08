package Entities;

public class Instructor {
    private String instructorName;
    private String instructorLastName;


    public Instructor(String instructorName, String instructorLastName) {
        this.instructorName = instructorName;
        this.instructorLastName = instructorLastName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }
}



