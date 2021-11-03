import java.util.ArrayList;
import java.util.Scanner;

public class studentArraylist {

	private String name;
	int phone, age;

	public studentArraylist(String name, int phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getPhone() {
		return phone;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		ArrayList<studentArraylist> student = new ArrayList<studentArraylist>();

		Scanner scan = new Scanner(System.in);

		System.out.print("Number of students : ");
		int n = scan.nextInt();

		int count = 0;

		for (int i = 1; i <= n; i++) {

			System.out.print("Enter name : ");
			String name = scan.next();

			System.out.print("Enter phone number : ");
			int phone = scan.nextInt();

			System.out.print("Enter age : ");
			int age = scan.nextInt();

			studentArraylist st = new studentArraylist(name, phone, age);

			student.add(st);

			count++;
			System.out.println(count + " data registered");
		}

		System.out.println(" data whose age is 18+ : ");
		for (int i = 0; i < student.size(); i++) {
			if ((student.get(i).age >= 18)) {
				System.out.println(student.get(i).getName());
				System.out.println(student.get(i).getPhone());
				System.out.println(student.get(i).getAge());
			}
		}

	}

}
