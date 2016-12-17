package com.example.caraidselector.models;

public enum CarType {
	MOTORBIKE("����",0),
	SPORTSCAR("�]��",1),
	SUV("��Ȩ�",2),
	BENS("���h",3),
	NODEF(" ���w�q",-1);
	
	private String typeName;
	private int id;
	
	private CarType(String typeName, int id){
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
	
	public static CarType getTypeFromId(int id){
		CarType[] carTps = CarType.values();
		CarType retp = CarType.NODEF;
		for(CarType car: carTps){
			if(car.getId()==id){
				return car;
			}
		}
		return retp;
	}
}
