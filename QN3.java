package Workshop5;

public class QN3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog44 dg = new dog44("Buddy","Pitbull");
		
		System.out.println("Name: "+dg.getName());
		System.out.println("Breed: "+dg.getBreed());
	}

}
class animal46{
	private String name;
	int age;
	
	animal46(String name){
		this.name = name; 
	}
	
	String getName() {
		return name; 
	}
	
}
class dog44 extends animal46{
	private String breed;
	dog44(String name,String breed) {
		super(name);
		this.breed = breed;
	}
	String getBreed() {
		return breed;
		
	}
	
}