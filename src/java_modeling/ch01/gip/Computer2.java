package java_modeling.ch01.gip;

public class Computer2 {
	private MainBoard mb;
	private CPU c;
	private Memory m;
	private PowerSupply ps;
	
	
	//不会因为computer的消失而消失
	public Computer2(MainBoard mb, CPU c, Memory m, PowerSupply ps) {
		this.mb = mb;
		this.c = c;
		this.m = m;
		this.ps = ps;
	}
}
