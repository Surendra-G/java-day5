package Workshop5;

public class QN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		animal45 ANI = new animal45();
		dog45 dg = new dog45();
		dg.name = "Tommy";
		dg.age = 4;
		dg.breed = "German Shepherd";
		dg.display();
	}

}
class animal45{
	String name;
	int age;
	
}
class dog45 extends animal45{
	String breed;
	void display() {
		System.out.println("Name: "+name+"\nAge: "+age+"\nBreed: "+breed);
	}
	
}