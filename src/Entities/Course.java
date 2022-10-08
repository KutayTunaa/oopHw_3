package Entities;

public class Course {
    private String courseName;
    private double price;
    private String category;
    private String instructor;

    public Course(String courseName, double price, String category, String instructor) {
        this.courseName = courseName;
        this.price = price;
        this.category = category;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}

