package homework3;

public class UserManager {
	public void addUser(User user){
		System.out.println(user.id + " " + user.firstName + " " + user.lastName + " kullan�c�  kaydedildi");
	}
	
	public void deleteUser(User user){
		System.out.println(user.id + " " + user.firstName + " " + user.lastName + " kullan�c� silindi");
	}
}
