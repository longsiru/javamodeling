package java_modeling.ch01.gip;

public class Computer {
	private MainBoard mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;
	
	
	//会随着computer的消失而消失
	public Computer() {
		this.mb = new MainBoard();
		this.c = new CPU();
		this.m = new Memory();
		this.ps = new PowerSupply();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
