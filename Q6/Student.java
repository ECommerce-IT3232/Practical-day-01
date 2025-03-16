public class Student{
    private String name;
    private int[] marks;

    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return this.name;
    }

    public int[] getMarks(){
        return this.marks;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMarks(int[] marks){
        this.marks = marks;
    }

    public void getAverage(){
        int sum = 0;
        double average ;
        for(int i=0; i<marks.length; i++){
            sum += marks[i];
        }

        average = (double )sum / marks.length;

        System.out.println("Average of " + name +  " is: "+ average);
    }
}