package com.klef.jfsd.exam.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_table")
public class Product
{
  @Id
  @Column(name = "sid")
  private int id;
  @Column(name = "sname",nullable = false,length = 50)
  private String productname;
  @Column(name = "quantity",nullable = false,length = 50,unique = true)
  private String quantity;
  @Column(name = "orderdata",nullable = false,length = 20,unique = true)
  private String orderdata;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getOrderdata() {
	return orderdata;
}
public void setOrderdata(String orderdata) {
	this.orderdata = orderdata;
}
}