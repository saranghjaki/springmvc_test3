package com.junefw.infra.modules.code;

public class CodeVo {
	
	private String pilcgSeq;
	
	/* CodeGroup Search */
	private String shPilcgName;
	private Integer shPilcgDelNy;
	/* code s */
	private String pilcdSeq;
	/* Code Search */
	private Integer shPilcgSeq;

		
	public String getPilcgSeq() {
		return pilcgSeq;
	}
	public void setPilcgSeq(String pilcgSeq) {
		this.pilcgSeq = pilcgSeq;
	}
	


	public String getPilcdSeq() {
		return pilcdSeq;
	}
	public void setPilcdSeq(String pilcdSeq) {
		this.pilcdSeq = pilcdSeq;
	}
	public String getShPilcgName() {
		return shPilcgName;
	}
	public void setShPilcgName(String shPilcgName) {
		this.shPilcgName = shPilcgName;
	}
	public Integer getShPilcgDelNy() {
		return shPilcgDelNy;
	}
	public void setShPilcgDelNy(Integer shPilcgDelNy) {
		this.shPilcgDelNy = shPilcgDelNy;
	}
	public Integer getShPilcgSeq() {
		return shPilcgSeq;
	}
	public void setShPilcgSeq(Integer shPilcgSeq) {
		this.shPilcgSeq = shPilcgSeq;
	}

}
