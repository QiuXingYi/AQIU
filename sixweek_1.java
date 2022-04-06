package java_text;
import java.util.Scanner;

class Person{
	String name;
	String job;
	public Person(){
		System.out.println("请输入你的名字:");
	}
	void GetSelf(String s1){
		name = s1;
		job = "Person";
	}
	void introduceSelf(){
		System.out.println("我的名字是: "+name+" 我的职业是: "+job);
	}
}

class Student extends Person{
	void GetSelf(String s1){
		name = s1;
		job = "Student";
	}
}

class Employee extends Person{
	void GetSelf(String s1){
		name = s1;	
		job = "Employee";
	}
}

class Retired extends Person{
	void GetSelf(String s1){
		name = s1;	
		job = "Retired";
	}
}


public class sixweek_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入人数:");
		String s;
		int num = 0;
		num = in.nextInt();
		int cho=0;
		Person[] pr = new Person[num];
		for (int i = 0; i < num; i++) {
			System.out.println("请选择一下编号：");
			System.out.println("1.Person 2.Student 3.Employee 4.Retired");
			cho = in.nextInt();
			switch (cho) {
			case 1:
				pr[i]= new Person();
				s = in.next();
				pr[i].GetSelf(s);
				break;
			case 2:
				pr[i]= new Student();
				s = in.next();
				pr[i].GetSelf(s);
				break;
			case 3:
				pr[i] = new Employee();
				s = in.next();
				pr[i].GetSelf(s);
				break;
			case 4:
				pr[i] = new Retired();
				s = in.next();
				pr[i].GetSelf(s);
				break;
			default:
				System.out.println("你的输入是错的 , 请重新输入");
				break;
			}
		}
		System.out.println("每个人的介绍:");
		for (int i = 0; i < num; i++) {
			pr[i].introduceSelf();
		}	
	}
}


