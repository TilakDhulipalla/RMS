package com.raven.restaurant.model;

public class Menu_item {
	
	int item_id, item_price;
	String item_name, item_Description ;
	public Menu_item(int item_id, int item_price, String item_name, String item_Description) {
		super();
		this.item_id = item_id;
		this.item_price = item_price;
		this.item_name = item_name;
		this.item_Description = item_Description;
	}
	public Menu_item() {
		super();
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_Description() {
		return item_Description;
	}
	public void setItem_Description(String item_Description) {
		this.item_Description = item_Description;
	}
	@Override
	public String toString() {
		return "Menu_item [item_id=" + item_id + ", item_price=" + item_price + ", item_name=" + item_name
				+ ", item_Description=" + item_Description + "]";
	}
	
	

}
