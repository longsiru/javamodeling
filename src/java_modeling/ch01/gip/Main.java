package java_modeling.ch01.gip;

public class Main {
	//컴퓨터만 생성해도 컴퓨터 부품들이 다 생성.
	//Computer c = new Computer();
	
	//computer消失的话，零件也消失。
	//c = null;
	
	//2.빕약관계
	MainBoard mb = new MainBoard();
	CPU cpu = new CPU();
	Memory m = new Memory();
	PowerSupply ps = new PowerSupply();
	
	
	Computer2 c2 = new Computer2(mb, cpu, m, ps);
	c2 = null;
	
}
