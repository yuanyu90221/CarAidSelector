package com.example.caraidselector.models;

public enum AreaType {
	TAIPEI("台北",0),
	TAICHUNG("台中",1),
	TAINAN("台南",2),
	KAOHSUING("高雄",3),
	NODEF(" 未定義",-1);
	private String areaName;
	private int id;
	private AreaType(String areaName, int id){
		this.areaName = areaName;
		this.id = id;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public static AreaType getTypeFromId(int id){
		AreaType[] arTps = AreaType.values();
		AreaType reTp = AreaType.NODEF;
		for(AreaType area: arTps){
			if(area.getId()==id){
				return area;
			}
		}
		return reTp;
	}
}
