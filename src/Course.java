// Course class
class Course {
    private String courseName;
    private Teacher teacher;
    private Gradebook[] gradebooks;

    public Course(String courseName, Teacher teacher, Gradebook[] gradebooks) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.gradebooks = gradebooks;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Gradebook[] getGradebooks() {
        return gradebooks;
    }

    public void setGradebooks(Gradebook[] gradebooks) {
        this.gradebooks = gradebooks;
    }
}