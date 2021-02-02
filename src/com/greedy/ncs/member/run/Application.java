package com.greedy.ncs.member.run;


import java.util.Date;

import com.greedy.ncs.member.model.dto.MemberDTO;

public class Application {

	public static void main(String[] args) {
		Date dt = new Date();
		
		MemberDTO me = new MemberDTO("songID", "songPW", "송준원", dt+"", "171", "68", "유", "1");
		System.out.println(me);

	}

}
