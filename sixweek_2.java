package java_text;
import java.awt.geom.Area;
import java.util.Scanner;

class Shape{
	Scanner in = new Scanner(System.in);
	double area;
	double GetArea(){
		return area;
	}	
}

class Rectangle extends Shape{
	double len;	double wid;
	public Rectangle() {
		System.out.println("请输入长度和宽度:");
		len = in.nextDouble();	
		wid = in.nextDouble();
	}
	double GetArea(){
		area = len*wid;
		return area;
	}	
}

class Circle extends Shape{
	static final double t = 3.1415926;
	double rad;
	public Circle() {
		System.out.println("请输入半径：");
		rad = in.nextDouble();
	}
	double GetArea(){
		area = 0.5*t*Math.pow(rad, 2);
		return area;
	}
}

public class sixweek_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入图形个数:");
		int num = 0;
		num = in.nextInt();
		int cho=0;
		Shape[] sp = new Shape[num];
		for (int i = 0; i < num; i++) {
			System.out.println("请选择图形类型：");
			System.out.println("1.Rectangle 2.Circle ");
			cho = in.nextInt();
			switch (cho) {
			case 1:
				sp[i]= new Rectangle();
				System.out.println("这个矩形的面积是: "+sp[i].GetArea());
				break;
			case 2:
				sp[i] = new Circle();
				System.out.println("这个圆的面积是: "+sp[i].GetArea());
				break;
			default:
				System.out.println("你输入有错 , 请重新输入");
				break;
			}
		}	
		
	}
}