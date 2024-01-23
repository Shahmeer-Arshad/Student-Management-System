// Teacher class (inherits from Person class)
class Teacher extends PersonImpl {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}






