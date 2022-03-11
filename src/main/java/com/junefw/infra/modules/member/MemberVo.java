package com.junefw.infra.modules.member;

public class MemberVo {

	private String pilmmSeq = "";
	/* member Search */
	private String shPilmmName = "";
	private Integer shPilmmDelNy;

	public String getPilmmSeq() {
		return pilmmSeq;
	}

	public void setPilmmSeq(String pilmmSeq) {
		this.pilmmSeq = pilmmSeq;
	}

	public String getShPilmmName() {
		return shPilmmName;
	}

	public void setShPilmmName(String shPilmmName) {
		this.shPilmmName = shPilmmName;
	}

	public Integer getShPilmmDelNy() {
		return shPilmmDelNy;
	}

	public void setShPilmmDelNy(Integer shPilmmDelNy) {
		this.shPilmmDelNy = shPilmmDelNy;
	}
	
}
