package Objects;

public class Circles {
	
		Dots center;
		double radio;
		final double PI = Math.PI; //final --- constant
		
		Circles(){//constructor
			center=new Dots();//attributes initialization
			radio=0;
		}
		
		//setters and getters
		void setValues(double x, double y, double r){
			center.x=x;
			center.y=y;
			this.radio=r;//current class reference
		}
		
		double getRadio(){
			return this.radio;
		}
		
		double Area(){
			return PI * Math.pow(radio, 2);
		}
		
		public static void main(String[] args) {
			   Circles c =  new Circles();
			   c.setValues(3, 4, 6);
			   System.out.println("The circle square area is " + c.Area());
			}

}


class Dots{
	double x,y;//attributes
}
