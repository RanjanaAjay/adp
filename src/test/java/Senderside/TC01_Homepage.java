package Senderside;

import org.testng.annotations.Test;

import Generals.Baseclass;
import fileutils.MyListeners;

import org.testng.annotations.Listeners;


@Listeners(fileutils.Testlistener.class)
public class TC01_Homepage extends  Baseclass{

	@Test
	public void verifyHomePage() {
		System.out.println("Home page");
	}
	
	
}
