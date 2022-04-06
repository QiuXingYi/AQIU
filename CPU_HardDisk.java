package java_text;

class CPU{
	int speed;
	void setSpeed(int sd) {
		speed = sd;
	}
	int getSpeed() {
		return speed;
	}
}
class HardDisk{
	int Amount;
	void setAmount(int rl) {
		Amount = rl;
	}
	int getAmount() {
		return Amount;
	}
}
class PC{
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU s){
		cpu = s;
	}
	void  setHardDisk(HardDisk m) {
		HD = m;
	}
	void show() {
		System.out.println("CPU的速度是："+cpu.getSpeed());
		System.out.println("HardDisk的容量是："+HD.getAmount());
	}
}
public class CPU_HardDisk {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		cpu.setSpeed(2200);
		HardDisk disk = new HardDisk();
		disk.setAmount(200);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
	
}
