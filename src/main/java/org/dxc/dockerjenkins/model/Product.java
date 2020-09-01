package org.dxc.dockerjenkins.model;

public class Product {
public int pId;
public String pName;
public String category;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pId, String pName, String category) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.category = category;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}

}
