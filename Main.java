package homework3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student esra=new Student();
	esra.setId(1);
	esra.setFirstName("Esra");
	esra.setLastName("Alkan");
	esra.setEmail("alkanesraa@gmail.com");
	esra.setPassword("123456");
	esra.setStudentNo(321);
	esra.setTakenCourses(new String[]{"Java",".."});
	
	
	Instructor engin=new Instructor();
	engin.setId(2);
	engin.setFirstName("Engin");
	engin.setLastName("Demiro?");
	engin.setEmail("abcdabcbd");
	engin.setPassword("123456");
	engin.setInstructorNo(222);
	engin.setGivenCourses(new String[]{"Java","C#"});
	
	UserManager userManager=new UserManager();
	userManager.addUser(esra);
	userManager.addUser(engin);
	
	StudentManager managerS=new StudentManager();
	managerS.studentCourses(esra);
	managerS.addToCourse(esra);
	
	userManager.deleteUser(esra);
	
	InstructorManager managerI=new InstructorManager();
	managerI.instructorCourses(engin);

}
}