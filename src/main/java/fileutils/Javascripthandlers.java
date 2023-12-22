package fileutils;

import org.openqa.selenium.JavascriptExecutor;

import Generals.*;

public class Javascripthandlers extends Baseclass {
	Elementhandler eh = new Elementhandler();
	//private JavascriptExecutor driver;
	JavascriptExecutor js = (JavascriptExecutor) adp.driver;

	public void clickButtonJS(String elementkey) {
		js.executeScript("argument[0].click();", eh.findingElement(elementkey));
	}

	public void jsAlert() {
		js.executeScript("alert('Welcome to ADP alert');");
	}

	public String domainName() {
		return js.executeScript("return document.domain;").toString();
	}

	public String jsURL() {
		return js.executeScript("return document.URL;").toString();
	}

	public String jsTitle() {
		return js.executeScript("return document.title;").toString();
	}

	public void jsOpenUrl() {
		js.executeScript("window.location='https://jobs.adp.com/';");

	}

	public void jsVericalScroll(int val) {
		js.executeScript("window.scrollBy(0," + val + ")");
	}

	public void jsHorizontalScroll(int val) {
		js.executeScript("window.scrollBy(" + val + ", 0)");
	}

	// public void jsSendKeys(;)

	public void jsRefereshBrowser() {
		js.executeScript("history.go(0)");
	}

}
