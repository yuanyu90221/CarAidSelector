package com.example.caraidselector.models;

public enum PayType {
	CREDIT("信用卡",0),
	CASH("現金",1);
	private String typeName;
	private int id;
	
	private PayType(String typeName, int id){
		this.typeName = typeName;
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
