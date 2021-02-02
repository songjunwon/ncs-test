package com.greedy.ncs.member.model.dto;

public class MemberDTO {
	
	private String id;
	private String pw;
	private String name;
	private String date;
	private String te;
	private String si;
	private String tr;
	private String memberNumber;
	
	public MemberDTO(String id, String pw, String name, String date, String te, String si, String tr,
			String memberNumber) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.date = date;
		this.te = te;
		this.si = si;
		this.tr = tr;
		this.memberNumber = memberNumber;
	}

	@Override
	
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", date=" + date + ", te=" + te + ", si=" + si
				+ ", tr=" + tr + ", memberNumber=" + memberNumber + "]";
	}
	
}
