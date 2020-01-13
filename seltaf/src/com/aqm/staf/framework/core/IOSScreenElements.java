package com.aqm.staf.framework.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;


import io.appium.java_client.MobileElement;

import io.appium.java_client.ios.IOSElement;

public class IOSScreenElements extends IOSElement  {
	private By by;
	private String fieldname;
	private boolean isSlowLoadableComponent;
	WaitType waitType;
	private int timeOut;
	private MobileElement mobileElement;
	public IOSScreenElements(By by, String fieldName) {
		super();
		this.by = by;
		this.fieldname = fieldName;
	}

	public IOSScreenElements(By by, String fieldName, boolean isSlowLoadableComponent, WaitType waitType, int timeOut) {
		super();
		this.by = by;
		this.fieldname = fieldName;
		this.isSlowLoadableComponent = isSlowLoadableComponent;
		this.waitType = waitType;
		this.timeOut = timeOut;
	}

	public MobileElement getMobileElement() {
		return mobileElement;
	}

	public void setWebElement(MobileElement mobileElement) {
		this.mobileElement = mobileElement;
	}

	public By getBy() {
		return by;
	}

	public void setBy(By by) {
		this.by = by;
	}

	public String getName() {
		return fieldname;
	}

	public void setName(String name) {
		this.fieldname = name;
	}

	public boolean isSlowLoadableComponent() {
		return isSlowLoadableComponent;
	}

	public void setSlowLoadableComponent(boolean isSlowLoadableComponent) {
		this.isSlowLoadableComponent = isSlowLoadableComponent;
	}

	public WaitType getWaitType() {
		return waitType;
	}

	public void setWaitType(WaitType waitType) {
		this.waitType = waitType;
	}

	public int getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(int timeOut) {
		this.timeOut = timeOut;
	}

	@Override
	public String toString() {
		return "PageElement [fieldName=" + fieldname + "] ";
	}
}
