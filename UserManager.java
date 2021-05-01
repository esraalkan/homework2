package homework3;

public class UserManager {
	public void addUser(User user){
		System.out.println(user.id + " " + user.firstName + " " + user.lastName + " kullanýcý  kaydedildi");
	}
	
	public void deleteUser(User user){
		System.out.println(user.id + " " + user.firstName + " " + user.lastName + " kullanýcý silindi");
	}
}
