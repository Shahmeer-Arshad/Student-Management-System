// GPA Calculator class
class GPACalculator {
    public static double calculateGPA(Gradebook[] gradebooks) {
        double totalCredits = 0;
        double weightedSum = 0;

        for (Gradebook gradebook : gradebooks) {
            String courseName = gradebook.getCourseName();
            int marks = gradebook.getMarks();

            // Calculate credits based on course name
            double credits = calculateCredits(courseName);

            // Calculate weighted sum
            weightedSum += marks * credits;

            // Update total credits
            totalCredits += credits;
        }

        if (totalCredits > 0) {
            return weightedSum / totalCredits;
        } else {
            return 0.0;
        }
    }

    private static double calculateCredits(String courseName) {
        // Logic to calculate credits based on course name
        // Return the appropriate credits value
        // You can define your own logic here based on your grading system
        // For simplicity, let's assume all courses have 3 credits
        return 3.0;
    }
}
