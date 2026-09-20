class Student {
    String name;
    int age;
    int marks;

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Raj";
        s1.age = 20;
        s1.marks = 85;

        s2.name = "Priya";
        s2.age = 19;
        s2.marks = 90;

        s3.name = "Anu";
        s3.age = 20;
        s3.marks = 88;

        System.out.println("Student 1: " + s1.name + " " + s1.age + " " + s1.marks);
        System.out.println("Student 2: " + s2.name + " " + s2.age + " " + s2.marks);
        System.out.println("Student 3: " + s3.name + " " + s3.age + " " + s3.marks);
    }
}
