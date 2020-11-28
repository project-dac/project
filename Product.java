package project.pocs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private String prodid;
	private  int pqnty;
	private String pshopname;
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public int getPqnty() {
		return pqnty;
	}
	public void setPqnty(int pqnty) {
		this.pqnty = pqnty;
	}
	public String getPshopname() {
		return pshopname;
	}
	public void setPshopname(String pshopname) {
		this.pshopname = pshopname;
	}
	public Product(String prodid, int pqnty, String pshopname) {
		
		this.prodid = prodid;
		this.pqnty = pqnty;
		this.pshopname = pshopname;
	}
	public Product() {
		
	}
	
	

}
