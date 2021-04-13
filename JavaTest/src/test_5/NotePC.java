package test_5;

public class NotePC extends Pasokon {
	
	NotePC() {
		this.name = "ノートパソコン";
	}
	
	public boolean hasCover() {
		return true;
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
