package homework3;

public class InstructorManager extends UserManager{

	public void instructorCourses(Instructor instructor)
	{
		System.out.println("---------------");
		System.out.println(instructor.firstName + " " + instructor.lastName +" verdiði kurslar:");
		for (int i=0; i<(instructor.givenCourses.length);i++){
			System.out.println((i+1) + "- " + instructor.getGivenCourses()[i]);
		}
		System.out.println("---------------");
}
}