package kodlamaioNLayeredApp.entities;

public class Course {

    private int id;

    private String courseName;
    private String instructorName;
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Course(int id, String courseName, String instructorName, String categoryName, int price) {
        this.id = id;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.price = price;
        this.categoryName = categoryName;

    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }


}
