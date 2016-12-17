package com.example.caraidselector.models;

import java.io.Serializable;

public class CustomObj implements Serializable {
	//做版本兼容性
	private static final long serialVersionUid = 1L;
	
	private String rent_name;
	private PayType paytp;
	private CarType cartp;
	private AreaType rent_from;
	private AreaType rent_to;
	
	public CustomObj(){
		
	}

	public CustomObj(String rent_name, PayType paytp, CarType cartp, AreaType rent_from, AreaType rent_to) {
		
		this.rent_name = rent_name;
		this.paytp = paytp;
		this.cartp = cartp;
		this.rent_from = rent_from;
		this.rent_to = rent_to;
	}

	public String getRent_name() {
		return rent_name;
	}

	public void setRent_name(String rent_name) {
		this.rent_name = rent_name;
	}

	public PayType getPaytp() {
		return paytp;
	}

	public void setPaytp(PayType paytp) {
		this.paytp = paytp;
	}

	public CarType getCartp() {
		return cartp;
	}

	public void setCartp(CarType cartp) {
		this.cartp = cartp;
	}

	public AreaType getRent_from() {
		return rent_from;
	}

	public void setRent_from(AreaType rent_from) {
		this.rent_from = rent_from;
	}

	public AreaType getRent_to() {
		return rent_to;
	}

	public void setRent_to(AreaType rent_to) {
		this.rent_to = rent_to;
	}

	public static long getSerialversionuid() {
		return serialVersionUid;
	}
	
	
}
