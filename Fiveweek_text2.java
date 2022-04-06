package java_text;
import java.util.Scanner;

class MyMedia{
	Scanner in = new Scanner(System.in);
	String mediaName;       //出版物名称
	float price;              //出版物价格
	String press;             //出版社（磁带发行商）
	String artist;             //作者（演唱者）
	void mediaNameInput(){}   //出版物名称输入成员函数
	void mediaPriceInput(){}    //价格输入成员函数
	void mediaPressInput(){}    //出版社（磁带发行商）输入成员函数
	void artistInput(){}         //作者（演唱者）输入成员函数
	void Input(){
		mediaNameInput();
		mediaPriceInput();
		mediaPressInput();
		artistInput();
	}
	void Print(){
		String name = null;
		System.out.println(name+"的名字是:"+mediaName);
		System.out.println(name+"的价格是:"+price);
		System.out.println(name+"的出版社是:"+press);
		System.out.println(name+"的作者是:"+artist);
		System.out.println("\n\n");
	}
}
class Book extends MyMedia{
	void mediaNameInput(){
		String name = "书";
		System.out.println("请输入书的名字：");
		mediaName = in.next();
	}
	void mediaPriceInput(){
		System.out.println("请输入书的价格：");
		price = in.nextInt();
	}
	
	void mediaPressInput(){
		System.out.println("请输入书的出版社：");
		press = in.next();
	}    
	
	void artistInput(){
		System.out.println("请输入书的作者：");
		artist = in.next();
	}   
}

class CD extends MyMedia{
	void mediaNameInput(){
		String name = "CD";
		System.out.println("请输入CD的名字：");
		mediaName = in.next();
	}
	void mediaPriceInput(){
		System.out.println("请输入CD的价格：");
		price = in.nextInt();
	}
	
	void mediaPressInput(){
		System.out.println("请输入CD的出版社：");
		press = in.next();
	}    
	
	void artistInput(){
		System.out.println("请输入CD的作者：");
		artist = in.next();
	}       
}

class Tape extends MyMedia{
	void mediaNameInput(){
		String name = "磁带";
		System.out.println("请输入磁带的名字：");
		mediaName = in.next();
	}
	void mediaPriceInput(){
		System.out.println("请输入磁带的价格：");
		price = in.nextInt();
	}
	
	void mediaPressInput(){
		System.out.println("请输入磁带的出版社：");
		press = in.next();
	}    
	
	void artistInput(){
		System.out.println("请输入磁带的作者：");
		artist = in.next();
	}       
}

class Vet{
	public  void show(MyMedia a) {
		System.out.println("您输入的是以下信息：");
		a.Print();
	}
}

public class Fiveweek_text2 {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String s = new String();
		System.out.println("请选择你要进行的操作（请输入1——4中的任一数字）：\n");
		int sgn = 0;
		while(true){
			Vet v = new Vet();
			System.out.println("1: 输入书的信息\n2: 输入CD的信息\n3: 输入磁带的信息\n4：退出系统");
			sgn = in.nextInt();
			if(sgn==4)	break;
			while(sgn>4||sgn<1){
				System.out.println("你输入的值不在1-4之间，请重新输入");
				sgn = in.nextInt();
			}
			
			switch (sgn) {
			case 1:
				Book b = new Book();
				b.Input();
				v.show(b);
				break;
			case 2:
				CD c = new CD();
				c.Input();
				v.show(c);
				break;
			case 3:
				Tape t = new Tape();
				t.Input();
				v.show(t);
				break;
			case 4:
				System.exit(sgn);;
			}	
		}	
	}
}