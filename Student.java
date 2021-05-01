package homework3;

public class Student extends User{
	int studentNo;
	String[] takenCourses;
	
	
		public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String[] getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String[] string) {
		this.takenCourses = string;
	}

}
