import java.util.Scanner;

class Circle0611 {
	private double x, y;
	private int radius;
	
	public Circle0611(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println( "가장 면적이 큰 원은 "+"(" + x + "," + y + ")" + radius );
	}
	
}
public class CircleManager {
	
	public static int compare(int[] num) {
		int max = num[0], inx = 0;
		
		for(int i=1; i<=2; i++) {
			if(num[i] > max) {
				max = num[i];
				inx = i;
			}
		}
		return inx;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Circle0611 c [] = new Circle0611[3];
		int[] num = new int[3];
		int inx;
		
		for(int i=0; i<3 ; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			num[i] = radius;
			//Circle 객체 배열 만들기
			c[i] = new Circle0611(x, y, radius);
		}
		inx = compare(num);
		
		c[inx].show();
		
		scanner.close();
	}
}
