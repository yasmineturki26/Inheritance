
public class Teacher extends Person {
     private int numCourses=0;
     private String [] courses;
    
    	public Teacher(String name, String adress) {
		super(name, adress);
                courses = new String[5];
        }

    public boolean addCourse(String course) {
		if(numCourses<5)
		{
		courses[numCourses] = course;
                numCourses++;
                return true;
                }
                else
                {
                    System.out.println("Max number of courses is 5");
                    return false;
                }
    }
    
    @Override
	public String toString() {
		String str = super.toString();
                        str += ", numCourses=" + numCourses + ", courses= ";
                         for(int i=0; i<numCourses; i++)
                            str += (courses[i] + "\t" );   
                         
                return str;
	}
                
    public boolean removeCourse(String crs)
    {
        boolean t = false;
        for(int i=0; i<numCourses; i++)
        {
            if(courses[i].equals(crs))
            {
                for(int j=i; j<numCourses-1; j++)
                   courses[j] =  courses[j+1];
                
                courses[numCourses-1] = null;
                numCourses--;
              t=  true;
              return t;
            }
        }
        if (t == false)
            {
                System.out.println("Course not found");
                
            }
     return t;   
    }
}
