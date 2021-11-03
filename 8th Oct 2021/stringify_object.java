public class stringify_object {

	private String name;
	private String email;
	private int phone;
	
	public stringify_object(String name, String email, int phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return " name : " + name + ", email:" + email + " and phone:" + phone;
	}


	public static void main(String[] args) {
		
		stringify_object obj1= new stringify_object("sneha","snehasuman@gmail.com",898756);
		System.out.println(obj1.toString());
		
		stringify_object obj2= new stringify_object("suman","suman@gmail.com",876765);
		System.out.println(obj2.toString());
	}


}
