import java.util.Scanner;

public class objectInitialize {
	
	String name;
	String email;
	int phone;


	public objectInitialize(String name, String mail, int phone) {
		super();
		this.name = name;
		this.email = mail;
		this.phone = phone;
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name=scan.nextLine();
		
		System.out.println("Enter email : ");
		String mail=scan.nextLine();
		
		System.out.println("Enter phone : ");
		int phone=scan.nextInt();
		
		objectInitialize obj = new objectInitialize(name,mail,phone);
		
		System.out.println("my name is : "+obj.name);
		System.out.println("my email is : "+obj.email);
		System.out.println("my phone number is : "+obj.phone);

	}

}
