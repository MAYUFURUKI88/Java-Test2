package test_5;

public class Desktop extends Pasokon {
	
	Desktop() {
		this.name = "デスクトップ";
	}
	
	public boolean hasCover() {
		return false;
	}
	public boolean hasBattery() {
		return false;
	}
	public boolean enableWifi() {
		return false;
	}
	public boolean isCarriable() {
		return true;
	}
	public boolean hasDisplay() {
		return false;
	}

}
