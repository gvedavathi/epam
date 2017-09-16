import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
StudentGroup s1=new StudentGroup(2);
Date d=new Date(1997,2,28);
Student m1=new Student(502,"veda",d,72.7);
s1.addFirst(m1);
System.out.println(s1.getStudent(0).getId());
	}

}
