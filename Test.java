
public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("Yasmine", "Nabeul");
       
        s1.addCourseGrade("Math", 70);
        s1.addCourseGrade("English", 80);
        s1.addCourseGrade("IT", 90);
        s1.printGrades();
       
          
        System.out.println("average grade = " + s1.getAverageGrade());
    }
    
}
