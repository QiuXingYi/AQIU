package java_text;
import java.util.Scanner;

class Person{
	String name;
	String job;
	public Person(){
		System.out.println("�������������:");
	}
	void GetSelf(String s1){
		name = s1;
		job = "Person";
	}
	void introduceSelf(){
		System.out.println("�ҵ�������: "+name+" �ҵ�ְҵ��: "+job);
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
		System.out.println("����������:");
		String s;
		int num = 0;
		num = in.nextInt();
		int cho=0;
		Person[] pr = new Person[num];
		for (int i = 0; i < num; i++) {
			System.out.println("��ѡ��һ�±�ţ�");
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
				System.out.println("��������Ǵ�� , ����������");
				break;
			}
		}
		System.out.println("ÿ���˵Ľ���:");
		for (int i = 0; i < num; i++) {
			pr[i].introduceSelf();
		}	
	}
}


