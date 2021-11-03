import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.Scanner;

public class User {
	
	String name;
	String email;
	int phone;
	
	public User(String name, String email, int phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [name:" + name + ", email:" + email + ", phone:" + phone + "]";
	}

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter you name : ");
		String name = src.nextLine();
		
		System.out.println("Enter you email : ");
		String mail = src.nextLine();
		
		System.out.println("Enter you phone : ");
		int phone = src.nextInt();

		User user1 = new User(name, mail, phone);
		String MyStringIs = user1.toString();
		System.out.println(MyStringIs);

		try {
			FileWriter fw = new FileWriter(
					"C:\\Users\\Sneha Suman\\IdeaProjects\\Java_Training_MPL\\src\\text.txt");
			fw.write(MyStringIs);
			fw.close();
		} catch (Exception e) {
			System.out.println(" error");
		}
	}
}
