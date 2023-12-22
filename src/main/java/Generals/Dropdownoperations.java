package Generals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownoperations extends Elementhandler{
	
	Select  sObject;

	public String getFirstSelectedOption(String elementKey) {
		sObject=new Select(findingElement(elementKey));
		return sObject.getFirstSelectedOption().getText();
		
	}
	

	public List<WebElement> getAllSelectedOptions(String elementKey) {
		sObject=new Select(findingElement(elementKey));
		return sObject.getAllSelectedOptions();
	}

	public List<WebElement> getAllOptions(String elementKey) {
		sObject=new Select(findingElement(elementKey));
		return sObject.getOptions();
		
	}

	public void deselectAll(String elementKey) {
		sObject=new Select(findingElement(elementKey));
		sObject.deselectAll();
		
	}

	public void deselectByIndex(String elementKey, int index) {
		sObject=new Select(findingElement(elementKey));
		sObject.deselectByIndex(index);
		
	}

	public void deselectByValue(String elementKey, String value) {
		sObject=new Select(findingElement(elementKey));
		sObject.deselectByValue(value);
		
	}

	public void deselectByVisibleText(String elementKey, String text) {
		sObject=new Select(findingElement(elementKey));
		sObject.deselectByVisibleText(text);
		
	}

	public void selectByIndex(String elementKey, int index) {
		sObject=new Select(findingElement(elementKey));
		sObject.selectByIndex(index);
		
	}

	public void selectByValue(String elementKey, String value) {
		sObject=new Select(findingElement(elementKey));
		sObject.selectByValue(value);
		
	}
	
	public void selectByVisibleText(String elementKey, String value) {
		sObject=new Select(findingElement(elementKey));
		sObject.deselectByVisibleText(value);
		
	}
	
	public boolean isMultiple(String elementKey) {
		sObject=new Select(findingElement(elementKey));
	return	sObject.isMultiple();
		
	}
	public WebElement getWrappedElement(String elementKey) {
		sObject=new Select(findingElement(elementKey));
		return	sObject.getWrappedElement();
		
	}
	
	public void multiselectByValue(String elementKey, String... value) {
		sObject=new Select(findingElement(elementKey));
		if(sObject.isMultiple()) {
			for(String s:value)
				sObject.selectByValue(s);
		}
	}
	
public void multiselectByIndex(String elementKey, int... index) {
	sObject=new Select(findingElement(elementKey));
	if(sObject.isMultiple()) {
		for(int i:index)
			sObject.selectByIndex(i);
	}
	}
public void multiselectByVisibleText(String elementKey,String... text ) {
	sObject=new Select(findingElement(elementKey));
	if(sObject.isMultiple()) {
		for(String s:text)
			sObject.selectByValue(s);
	}
}
	
	//overloaded methods for multiselect
public void multiSelect(String elementKey, String... value) {
	sObject=new Select(findingElement(elementKey));
	if(sObject.isMultiple()) {
		for(String s:value)
			sObject.selectByValue(s);
	}
}
	
public void multiSelect(String elementKey, int... index) {
	sObject=new Select(findingElement(elementKey));
	if(sObject.isMultiple()) {
		for(int i:index)
			sObject.selectByIndex(i);
	}
}


}
