package Objects;
/**
 * Object Oriented Programming
 * @author violeta
 *
 */
public class CircleArea {

	public static void main(String[] args) {
      Circle c = new Circle();
      c.center = new Dot();
      c.center.x=2;
      c.center.y=3;
      c.radio=7;
      double a = Math.PI * Math.pow(c.radio,2);
      System.out.println("The circle square area is "+a);

	}

}

class Dot{
	double x,y;//attributes
}

class Circle{
	Dot center;//attributes
	double radio;
}
