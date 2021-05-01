package homework3;

public class StudentManager extends UserManager{
	public void studentCourses(Student student)
	{
		System.out.println("---------------");
		System.out.println(student.firstName + " " + student.lastName +" aldığı kurslar:");
		for (int i=0; i<(student.takenCourses.length);i++){
			System.out.println((i+1) + "- " + student.getTakenCourses()[i]);
		}
		System.out.println("---------------");
	}
	public void addToCourse(Student student)
	{
		System.out.println(student.firstName + " " + student.lastName +" kursa eklendi");
	}
}