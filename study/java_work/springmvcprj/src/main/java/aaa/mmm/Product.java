package aaa.mmm;

import lombok.Data;

@Data
public class Product {

	String pname;
	Integer price, cnt, tot;
	
	public void setPrice(Integer price) {
		this.price = price;
		if(price==null) {
			this.price = 0;
		}
	}
	
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
		if(cnt==null) {
			this.cnt = 0;
		}
	}
	

	
}
