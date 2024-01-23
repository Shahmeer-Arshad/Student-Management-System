import java.util.Scanner;

// Main class
class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create school object
        System.out.print("Enter school name: ");
        String schoolName = scanner.nextLine();
        System.out.print("Enter school address: ");
        String schoolAddress = scanner.nextLine();
        School school = new School(schoolName, schoolAddress);

        // Create teacher object
        System.out.print("Enter teacher name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter teacher subject: ");
        String teacherSubject = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherSubject);

        // Create student objects
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Student name: ");
            String studentName = scanner.nextLine();
            System.out.print("Student age: ");
            int studentAge = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Student roll number: ");
            String studentRollNumber = scanner.nextLine();

            students[i] = new Student(studentName, studentAge, studentRollNumber);
        }

        // Create classroom object
        System.out.print("Enter classroom name: ");
        String className = scanner.nextLine();
        Classroom classroom = new Classroom(className, teacher, students);

        // Create gradebook objects
        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Gradebook[] gradebooks = new Gradebook[numCourses];
        String courseName = null;
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter details for course " + (i + 1) + ":");
            System.out.print("Course name: ");
            courseName = scanner.nextLine();
            System.out.print("Marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            gradebooks[i] = new Gradebook(courseName, marks);
        }


        Course course = new Course(courseName, teacher, gradebooks);

        System.out.println();
        System.out.println();
        // Display system details
        System.out.println("School Name: " + school.getName());
        System.out.println("School Address: " + school.getAddress());
        System.out.println("Classroom: " + classroom.getClassName());
        System.out.println("Teacher: " + classroom.getClassTeacher().getName());
        System.out.println("Number of Students: " + classroom.getStudents().length);
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Teacher: " + course.getTeacher().getName());
        System.out.println("Number of Gradebooks: " + course.getGradebooks().length);

        // Calculate GPA
        double gpa = GPACalculator.calculateGPA(gradebooks);
        System.out.println("GPA: " + gpa);

        scanner.close();
    }
}