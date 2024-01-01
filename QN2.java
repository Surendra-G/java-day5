package Workshop5;
import java.util.*;

public class QN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle cir = new circle(65);
		System.out.println("Perimeter of circle: "+cir.getperimeter());
		System.out.println("Area of Circle: "+cir.getArea());
	}

}
class shape{
	double getperimeter() {
		return 0.0;
	}
	double getArea() {
		return 0.0;
	}
	
}
class circle extends shape{
	private double radius;
	
	circle(double radius){
		this.radius = radius;
	}
	
	@Override
	double getperimeter() {
		return (2*Math.PI*radius);
//		  return (2*3.14*radius);
	}
	@Override
	double getArea() {
		return (Math.PI*radius*radius);
	}
}