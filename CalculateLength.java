package linecomparision;

public class CalculateLength {

	public static void main(String[] args) {
		double x1=4;
		double y1=4;
		double x2=3;
		double y2=3;
		double z1=((x2-x1)) * ((x2-x1));
		double z2=((y2-y1)) * ((y2-y1));
		
		double length=Math.sqrt(z1+z2);
		System.out.println("Distance between two points:-"+length);
	}

}
	