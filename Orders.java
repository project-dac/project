package project.pocs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
private String orderid;
private int orderqty;
private String prodid;

public Orders() {

}
public Orders(String orderid, int orderqty, String prodid) {
	
	this.orderid = orderid;
	this.orderqty = orderqty;
	this.prodid = prodid;
}
public String getOrderid() {
	return orderid;
}
public void setOrderid(String orderid) {
	this.orderid = orderid;
}
public int getOrderqty() {
	return orderqty;
}
public void setOrderqty(int orderqty) {
	this.orderqty = orderqty;
}
public String getProdid() {
	return prodid;
}
public void setProdid(String prodid) {
	this.prodid = prodid;
}
}
