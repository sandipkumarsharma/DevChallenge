package model;

import java.math.BigInteger;

public class Shop {
	
	private BigInteger longitude;
	 private long latitude;
	 private int addressNumber;	
	 private String shopName; 
	 private long shopPostCode;
	 
	 
	public Shop() {}


	public BigInteger getLongitude() {
		return longitude;
	}


	public void setLongitude(BigInteger longitude) {
		this.longitude = longitude;
	}


	public long getLatitude() {
		return latitude;
	}


	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}


	public int getAddressNumber() {
		return addressNumber;
	}


	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}


	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}


	public long getShopPostCode() {
		return shopPostCode;
	}


	public void setShopPostCode(long shopPostCode) {
		this.shopPostCode = shopPostCode;
	}


}
