package java_text;
import java.util.Scanner;

class MyMedia{
	Scanner in = new Scanner(System.in);
	String mediaName;       //����������
	float price;              //������۸�
	String press;             //�����磨�Ŵ������̣�
	String artist;             //���ߣ��ݳ��ߣ�
	void mediaNameInput(){}   //���������������Ա����
	void mediaPriceInput(){}    //�۸������Ա����
	void mediaPressInput(){}    //�����磨�Ŵ������̣������Ա����
	void artistInput(){}         //���ߣ��ݳ��ߣ������Ա����
	void Input(){
		mediaNameInput();
		mediaPriceInput();
		mediaPressInput();
		artistInput();
	}
	void Print(){
		String name = null;
		System.out.println(name+"��������:"+mediaName);
		System.out.println(name+"�ļ۸���:"+price);
		System.out.println(name+"�ĳ�������:"+press);
		System.out.println(name+"��������:"+artist);
		System.out.println("\n\n");
	}
}
class Book extends MyMedia{
	void mediaNameInput(){
		String name = "��";
		System.out.println("������������֣�");
		mediaName = in.next();
	}
	void mediaPriceInput(){
		System.out.println("��������ļ۸�");
		price = in.nextInt();
	}
	
	void mediaPressInput(){
		System.out.println("��������ĳ����磺");
		press = in.next();
	}    
	
	void artistInput(){
		System.out.println("������������ߣ�");
		artist = in.next();
	}   
}

class CD extends MyMedia{
	void mediaNameInput(){
		String name = "CD";
		System.out.println("������CD�����֣�");
		mediaName = in.next();
	}
	void mediaPriceInput(){
		System.out.println("������CD�ļ۸�");
		price = in.nextInt();
	}
	
	void mediaPressInput(){
		System.out.println("������CD�ĳ����磺");
		press = in.next();
	}    
	
	void artistInput(){
		System.out.println("������CD�����ߣ�");
		artist = in.next();
	}       
}

class Tape extends MyMedia{
	void mediaNameInput(){
		String name = "�Ŵ�";
		System.out.println("������Ŵ������֣�");
		mediaName = in.next();
	}
	void mediaPriceInput(){
		System.out.println("������Ŵ��ļ۸�");
		price = in.nextInt();
	}
	
	void mediaPressInput(){
		System.out.println("������Ŵ��ĳ����磺");
		press = in.next();
	}    
	
	void artistInput(){
		System.out.println("������Ŵ������ߣ�");
		artist = in.next();
	}       
}

class Vet{
	public  void show(MyMedia a) {
		System.out.println("���������������Ϣ��");
		a.Print();
	}
}

public class Fiveweek_text2 {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String s = new String();
		System.out.println("��ѡ����Ҫ���еĲ�����������1����4�е���һ���֣���\n");
		int sgn = 0;
		while(true){
			Vet v = new Vet();
			System.out.println("1: ���������Ϣ\n2: ����CD����Ϣ\n3: ����Ŵ�����Ϣ\n4���˳�ϵͳ");
			sgn = in.nextInt();
			if(sgn==4)	break;
			while(sgn>4||sgn<1){
				System.out.println("�������ֵ����1-4֮�䣬����������");
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