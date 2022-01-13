
public class Student extends Person {
  
        private int numCourses=0;
	private String [] courses;
	private int []grades;


	public Student(String name, String adress) {
		super(name, adress);
                courses = new String[30];
                grades = new int [30];
}


	public void addCourseGrade(String course, int grade) {
		if(numCourses<30)
		{
		courses[numCourses] = course;
                if(grade < 0)
                    System.out.println("Invalid");
                else
		grades[numCourses] = grade;
                
		numCourses++;
		}
		else {
			System.out.println("Maximum number of courses is 30");
		}
	}
    
	public void printGrades() {
		for(int i=0; i<numCourses; i++)
                    System.out.println(courses[i] + "\t" + grades[i]);
	}
        
	public double getAverageGrade() {
            int sum = 0;
            for(int i=0; i<numCourses; i++){
                sum += grades[i];}
            
		return ((double)sum /(double)numCourses);
	}
	

	@Override
	public String toString() {
		String str = super.toString();
                        str += "numCourses=" + numCourses + ", courses= \n";
                         for(int i=0; i<numCourses; i++)
                            str += (courses[i] + "  " + grades[i] + "\n");   
                         
                return str;
	}

}
