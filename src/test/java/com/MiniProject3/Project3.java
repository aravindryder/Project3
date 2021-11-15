package com.MiniProject3;

import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class;
import com.Help.FileReader;
import com.Sdp.SDP;

public class Project3 extends Base_Class {

	public static WebDriver wd = Browser("chrome");
	
	public static SDP s = new SDP(wd);

	public static void main(String[] args) throws Throwable {

		String url = FileReader.getfr().getcr().url();
		Get_URL(url);
		snap("photo.png");
		sleep(3000);
		
		String username = FileReader.getfr().getcr().username();
		implicity();
		Pass(s.getL().getName(), username);
		String password = FileReader.getfr().getcr().password();
		implicity();
		Pass(s.getL().getPass(), password);
		snap("photo1.png");
		sleep(3000);
		click(s.getL().getLogin());
		sleep(3000);
		snap("photo2.png");
		
		Drop_Down(s.getSh().getSite(), "byvisibletext", "London");
		implicity();
		Drop_Down(s.getSh().getHotel(), "byvisibletext", "Hotel Sunshine");
		sleep(3000);
		snap("photo3.png");
		Drop_Down(s.getSh().getRoom(), "byvisibletext", "Deluxe");
		implicity();
		Drop_Down(s.getSh().getNos(), "byvalue", "2");
		sleep(3000);
		snap("photo4.png");
		Pass(s.getSh().getIn(), "29/10/2021");
		implicity();
		Pass(s.getSh().getOut(), "31/10/2021");
		sleep(3000);
		snap("photo5.png");
		Drop_Down(s.getSh().getAdult(), "byvalue", "2");
		implicity();
		Drop_Down(s.getSh().getChild(), "byvalue", "2");
		sleep(3000);
		snap("photo6.png");
		click(s.getSh().getSearch());
		sleep(3000);
		snap("photo7(1).png");
		sleep(5000);
		
		click(s.getSel().getSelect());
		sleep(3000);
		snap("photo7.png");
		click(s.getSel().getCon());
		snap("photo8.png");
		sleep(5000);
		
		String firstname = FileReader.getfr().getcr().firstname();
		Pass(s.getBh().getFirst(), firstname);
		implicity();
		String lastname = FileReader.getfr().getcr().lastname();
		Pass(s.getBh().getLast(), lastname);
		implicity();
		String address = FileReader.getfr().getcr().address();
		Pass(s.getBh().getAddress(), address);
		implicity();
		snap("photo9.png");
		sleep(3000);
		String card = FileReader.getfr().getcr().card();
		Pass(s.getBh().getCc(), card);
		sleep(3000);
		Drop_Down(s.getBh().getType(), "byvalue", "AMEX");
		sleep(3000);
		snap("photo10.png");
		sleep(2000);
		Drop_Down(s.getBh().getMonth(), "byvalue", "8");
		implicity();
		Drop_Down(s.getBh().getYear(), "byvalue", "2022");
		implicity();
		String cvv = FileReader.getfr().getcr().cvv();
		Pass(s.getBh().getCvv(), cvv);
		snap("photo11.png");
		sleep(3000);
		click(s.getBh().getBook());
		sleep(3000);
		snap("photo12.png");
		sleep(5000);
		
		click(s.getC().getIti());
		sleep(5000);
		snap("photo13.png");
		
		click(s.getI().getOut());
		snap("photo14.png");
		sleep(5000);
		
		quit();
	}
}