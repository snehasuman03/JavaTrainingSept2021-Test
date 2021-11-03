class grandparents{
	void grandparents_method() {
		System.out.println("Grand Parents ");
	}
}
class parents extends grandparents{
	void parentmethod() {
		System.out.println("Parents");
		grandparents_method();
	}
}
class child extends parents{
	void child_method() {
		System.out.println("child");
		parentmethod();
	}
}

public class multilevel_inheritance {

	public static void main(String[] args) {
		

		System.out.println();
		child c= new child();
		c.child_method();

	}

}
