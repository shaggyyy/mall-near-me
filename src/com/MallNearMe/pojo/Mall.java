package com.MallNearMe.pojo;

public class Mall {

	public int MallId;
	public String MallName;
	public String Locality;
	public String A;
	public String B;
	
	public String getA() {
		return A;
	}

	public void setA(String a) {
		A = a;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	public Mall() {
		super();
	}
	
	public Mall(int mallId, String mallName, String locality) {
		super();
		MallId = mallId;
		MallName = mallName;
		Locality = locality;
	}
	
	public int getMallId() {
		return MallId;
	}
	public void setMallId(int mallId) {
		MallId = mallId;
	}
	public String getMallName() {
		return MallName;
	}
	public void setMallName(String mallName) {
		MallName = mallName;
	}
	public String getLocality() {
		return Locality;
	}
	public void setLocality(String locality) {
		Locality = locality;
	}
	@Override
	public String toString() {
		return "Mall [MallId=" + MallId + ", MallName=" + MallName + ", Locality=" + Locality + "]";
	}
	
	
	
}
