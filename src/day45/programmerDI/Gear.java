package day45.programmerDI;

public class Gear {
			
	private int gearLever;
	private String gearMfgName;
	private String gearType;
	
	public Gear() {}
	public Gear(int gearLever, String gearMfgName, String gearType) {
		this.gearLever = gearLever;
		this.gearMfgName = gearMfgName;
		this.gearType = gearType;
	}
	public int getGearLever() {
		return gearLever;
	}
	public void setGearLever(int gearLever) {
		this.gearLever = gearLever;
	}
	public String getGearMfgName() {
		return gearMfgName;
	}
	public void setGearMfgName(String gearMfgName) {
		this.gearMfgName = gearMfgName;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	
	@Override
	public String toString() {
		return "Gear [gearLever=" + gearLever + ", gearMfgName=" + gearMfgName + ", gearType=" + gearType + "]";
	}
	
	
}
