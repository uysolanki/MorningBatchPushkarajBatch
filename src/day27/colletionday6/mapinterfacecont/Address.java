package day27.colletionday6.mapinterfacecont;

public class Address {
	
	private int houseNo;
	private String streetName;
	private String locality;
	private int pinCode;
	
	public Address() {}
	public Address(int houseNo, String streetName, String locality, int pinCode) {
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.locality = locality;
		this.pinCode = pinCode;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetName=" + streetName + ", locality=" + locality + ", pinCode="
				+ pinCode + "]";
	}
	
	

}
