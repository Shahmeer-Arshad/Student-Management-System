// Student class (inherits from Person class)
class Student extends PersonImpl {
    private int age;
    private String rollNumber;

    public Student(String name, int age, String rollNumber) {
        super(name);
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
