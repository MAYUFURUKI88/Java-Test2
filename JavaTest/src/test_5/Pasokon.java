package test_5;

public abstract class Pasokon {
	
	String name;
	
	public abstract boolean hasCover();
	public abstract boolean hasBattery();
	public abstract boolean enableWifi();
	public abstract boolean isCarriable();
	public abstract boolean hasDisplay();

    @Override
    public String toString() {

    	String ret = "";
    	if(hasCover()) {
    		ret += this.name + "カバーは付いています" + "\n";
    		// return this.name + "カバーはあります";
    		// System.out.println(this.name + "カバーは付いています");
    	} else {
    		ret += this.name + "カバーは付いていません" + "\n";
    		// return this.name +  "カバーは付いています";
    		// System.out.println(this.name + "カバーはありません");
    	}
    	if(hasBattery()) {
    		ret += this.name + "バッテリーは付いています";
    		// return this.name + "カバーはあります";
    		// System.out.println(this.name + "バッテリーはついています");
    	} else {
    		ret += this.name + "バッテリーは付いていません";
    		// return this.name +  "カバーは付いています";
    		// System.out.println(this.name + "カバーは付いています");
    	}
    	return ret;
    }
}
