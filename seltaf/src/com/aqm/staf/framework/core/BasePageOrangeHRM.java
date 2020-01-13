package com.aqm.staf.framework.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BasePageOrangeHRM extends WebPage{
	private _PageElement adminMenu;
	private _PageElement userManagementMenu;
	private _PageElement usersManu;

	public BasePageOrangeHRM(WebDriver driver, String pageName){
		super(driver, "BasePage");
		adminMenu=new _PageElement(By.id("menu_admin_viewAdminModule"), "AdminMenu", true, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		userManagementMenu=new _PageElement(By.id("menu_admin_UserManagement"), "UserManagementMenu", true, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10);
		usersManu=new _PageElement(By.id("menu_admin_viewSystemUsers"), "UserManagementMenu", true, WaitType.WAITFORELEMENTTOBEDISPLAYED, 10); 
	}
	public BasePageOrangeHRM(){
		super();
	}
	public void navigateToUsers() {
		mouseOver(adminMenu);
		mouseOver(userManagementMenu);
		mouseOver(usersManu);
		click(usersManu);
	}
}
