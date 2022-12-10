package com.w2a.rough;

import java.util.Date;

public class TestTimeStamp {

	public static void main(String[] args) {
		
		
		Date d=new Date();
		String screenshotName=d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		System.out.println(d);
		System.out.println(screenshotName);
		System.out.println("Print Test Report");
		System.out.println("PostJira2");

	}

}
