package com.Android;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="android_mobile")
public class Mobile 
{
	@Id
	@Column(name = "Mobile_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Mobile_Name")
	private String Name;
	@Column(name = "Mobile_color")
	private String color;
	@Column(name = "Mobile_Storage")
	private String Storage;
	@Column(name = "Mobile_Cost")
	private double Price;
	@Column(name = "Mobile_camera")
	private String Camera;
	@Column(name = "Mobile_Ram")	
	private String Ram;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStorage() {
		return Storage;
	}
	public void setStorage(String storage) {
		Storage = storage;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getCamera() {
		return Camera;
	}
	public void setCamera(String camera) {
		Camera = camera;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	

}
