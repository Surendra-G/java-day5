package Workshop5;

public class QN5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child shh = new Child(20,"Surendra","Chandragiri");
		shh.display();
	}

}
class parent{
	private int age;
	protected String name;
	public String Address;
	
	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
	String getAddress() {
		return Address;
		
	}
	
}
class Child extends parent{
	Child(int age,String name,String Address){
		super();
		this.age = age;
		this.name =name;
		this.Address = Address;
		
		
	}
	void display() {
		System.out.println("Name: "+getName());
		System.out.println("\nAge: "+getAge());
		System.out.println("\nAddress: "+getAddress());
	}
}