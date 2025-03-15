public class student {
    String name;
    int marks;

    public student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public static void main(String[] args) {
        student student1 = new student("Alice", 85);
        student student2 = new student("Bob", 78);
        student student3 = new student("Charlie", 92);
        student student4 = new student("David", 67);
        student student5 = new student("Emma", 88);

        int totalMarks = student1.marks + student2.marks + student3.marks + student4.marks + student5.marks;

        double averageMarks = (double) totalMarks / 5;

        System.out.println("Average Marks: " + averageMarks);
    }
}
