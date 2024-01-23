// Classroom class
class Classroom {
    private String className;
    private Teacher classTeacher;
    private Student[] students;

    public Classroom(String className, Teacher classTeacher, Student[] students) {
        this.className = className;
        this.classTeacher = classTeacher;
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}