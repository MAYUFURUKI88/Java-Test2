package test_5;

public class Tablet extends Pasokon{
	
	Tablet() {
		this.name = "タブレット";
	}
	
	public boolean hasCover() {
		return false;
	}
	public boolean hasBattery() {
		return true;
	}
	public boolean enableWifi() {
		return true;
	}
	public boolean isCarriable() {
		return true;
	}
	public boolean hasDisplay() {
		return true;
	}

}
