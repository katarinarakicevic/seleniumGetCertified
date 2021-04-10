package com.youtestme.getcertified.core.pages;

import org.openqa.selenium.By;


/**
 * This class will contain convenient constants for elements inside login page.
 */
public class UserProfilesPage {

	/*
	 * New user
	 *
	 */ 
	public static final By UPDATE_PROFILE_PICTURE = By.xpath("//*[@id=\"newForm:j_idt422_label\"]");
	
	public static final By REMOVE_PROFILE_PICTURE = By.xpath("//*[@id=\"newForm:j_idt424\"]/span[1]");
	public static final By BASIC_INFO_ONLY = By.className("ui-toggleswitch-slider");
	public static final By INPUT_NEW_USERNAME = By.xpath("//*[@id=\"newForm:j_idt431_display\"]");
	public static final By SELECT_PASSWORD= By.xpath("//*[@id=\"newForm:options\"]/div[3]/span");
	public static final By SELECT_PASSWORD_GENERATED=By.xpath("//*[@id=\"newForm:options_0\"]");
	public static final By SELECT_PASSWORD_MANUALLY=By.xpath("//*[@id=\"newForm:options_1\"]");
	public static final By ENTER_PASSWORD = By.id("newForm:password");
	public static final By CONFIRM_PASSWORD = By.id("newForm:passConf");
	public static final By PASSWORD_EXPIRES= By.className("ui-inplace-display");
	public static final By SELECT_ROLE= By.xpath("//*[@id=\"newForm:roles\"]/div[3]/span");
	public static final By SELECT_ROLE_ADMIN=By.xpath("//*[@id=\"newForm:roles_1\"]");
	public static final By SELECT_USER_STATUS= By.xpath("//*[@id=\"newForm:status\"]/div[3]/span");
	public static final By SELECT_USER_STATUS_ACTIVE= By.xpath("//*[@id=\"newForm:status_0\"]");
	public static final By SELECT_USER_STATUS_SUSPENDED = By.xpath("//*[@id=\"newForm:status_1\"]");
	public static final By SELECT_USER_STATUS_LOCKED=By.xpath("//*[@id=\"newForm:status_2\"]");
	public static final String BASE_LANGUAGE = "newForm:language";
	public static final By INPUT_NEW_FIRST_NAME = By.xpath("//*[@id=\"newForm:j_idt482_display\"]");
	public static final By INPUT_NEW_LAST_NAME = By.xpath("//*[@id=\"newForm:j_idt491_display\"]");
	public static final By INPUT_NEW_BIRTH_DATE = By.id("newForm:birth_input");
	public static final String BASE_RADIO_GENDER_ID = "newForm:gen";
	public static final By INPUT_SEMESTER = By.id("newForm:semester_input");
	public static final By INPUT_YEAR = By.id("newForm:year_input");
	public static final By INPUT_PASSWORD_EXPIRES = By.id("newForm:passex_input");
	public static final String BASE_SELECT_ROLES = "newForm:roles";
	public static final String BASE_SELECT_STATUS = "newForm:status";
	public static final By INPUT_EMAIL = By.xpath("//*[@id=\"newForm:j_idt494_display\"]");
	
	public static final By INPUT_DAYTIME_PHONE = By.id("newForm:dayPhone");
	public static final By TYPE_ADDRESS = By.id("newForm:area");
	public static final By CREATE_USER_BUTTON = By.id("newForm:createBtn");
	public static final By BUTTON_NEW_USER_PANEL = By.xpath("//*[@id=\"butForm:newUserBtn\"]/span[2]");

	// SHOW USERS
	public static final By BUTTON_SHOW_USERS = By.xpath("//div[@id='butForm:showUsersBtn']/span");
	public static final By SHOW_DELETED_USERS = By.xpath("//div[@id='usersForm:showDeletedUsers']/div[2]/span");
	public static final By CHECK_USER = By.xpath("//tbody[@id='usersForm:usersTable_data']/tr/td/div/div[2]");
	public static final By BUTTON_SET_STATUS_TO = By.id("usersForm:usersTable:setStatusTo_button");
	public static final By SET_STATUS_TO_ACTIVE = By
			.xpath("//div[@id='usersForm:usersTable:setStatusTo_menu']/ul/li/a/span");
	public static final By SET_STATUS_TO_LOCKED = By
			.xpath("//div[@id='usersForm:usersTable:setStatusTo_menu']/ul/li[2]/a/span");
	public static final By SET_STATUS_TO_SUSPENDED = By
			.xpath("//div[@id='usersForm:usersTable:setStatusTo_menu']/ul/li[3]/a/span");
	public static final By SET_STATUS_TO_DELETED = By
			.xpath("//div[@id='usersForm:usersTable:setStatusTo_menu']/ul/li[4]/a/span");

}

