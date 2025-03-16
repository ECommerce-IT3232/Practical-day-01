public class Six {

    public static void main(String[] args) {

        Student[] students = new Student[5];

        int[] m1 = {68, 90, 54};
        int[] m2 = {78, 28, 80};
        int[] m3 = {86, 54, 34};
        int[] m4 = {100, 97, 88};
        int[] m5 = {54, 99, 74};

        Student s1 = new Student("Kamal", m1);
        Student s2 = new Student("Amal", m2);
        Student s3 = new Student("Kumara", m3);
        Student s4 = new Student("Nalaka", m4);
        Student s5 = new Student("Sanath", m5);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            s.getAverage();
            System.out.println("-----------------------");
        }
    }
}

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void getAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        System.out.println("Average Marks: " + average);
    }
}

/*
@Kasunchira ➜ /workspaces/Practical-day-01/Q6 (main) $ java Six
Name: Kamal
Average Marks: 70.66666666666667
-----------------------
Name: Amal
Average Marks: 62.0
-----------------------
Name: Kumara
Average Marks: 58.0
-----------------------
Name: Nalaka
Average Marks: 95.0
-----------------------
Name: Sanath
Average Marks: 75.66666666666667
-----------------------
*/