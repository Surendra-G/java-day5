package Workshop5;

public class QN4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee em =new employee("Chandragiri","IT");
		em.display();
	}

}
class person{
	protected String Address;
	
	person(String address) {
		this.Address = address;
	}
	
	
	String getAddress() {
		return Address;
	}
}
class employee extends person{
	protected String department;
	
	employee(String address,String department){
		super(address);
		this.department = department;
	}
	
	String getDepartment() {
		return department;
	}
	
	void display() {
		System.out.println("Address: "+getAddress());
		System.out.println("Department: "+getDepartment());
		
	}
	
}