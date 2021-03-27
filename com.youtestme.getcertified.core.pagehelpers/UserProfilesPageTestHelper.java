package com.youtestme.getcertified.core.pagehelpers;

import org.openqa.selenium.By;

import com.youtestme.getcertified.core.WebDriverExtended;
import com.youtestme.getcertified.core.pages.UserProfilesPage;

/**
 * Convinent methods for using the Login page.
 */
public class UserProfilesPageTestHelper extends UserProfilesPage {

	public static final int COUNTRY_USA = 2;
	public static final int PASSWORD_MANUAL = 0;
	public static final int PASSWORD_GENERATED = 0;

	private WebDriverExtended webDriverExtended;

	public UserProfilesPageTestHelper(WebDriverExtended webDriverExtended) {
		this.webDriverExtended = webDriverExtended;

	}

	public void selectPermissionList(int selectTableId, int selectPermissionId) throws Exception {
		String permission = "//div[@id='rolesForm:rolesTable:" + selectTableId + ":permissionTable:"
				+ selectPermissionId + ":roles']/div[2]";
		webDriverExtended.clickOnElement(By.xpath(permission));
	}

	public void selectNumberOfResults(String Results) throws Exception {
		System.out.println("Setting result show to " + Results);
		webDriverExtended.numberOfResults100();
	}

	// CREATE NEW USER
	public void pressNewUserPanel() throws Exception {
		System.out.println("Create new user panel.");
		webDriverExtended.clickOnElement(UserProfilesPage.BUTTON_NEW_USER_PANEL);
	}

	public void typeUsername(String value) throws Exception {
		webDriverExtended.type(UserProfilesPage.INPUT_NEW_USERNAME, value);
	}

	public void typeEmail(String value) throws Exception {
		webDriverExtended.type(UserProfilesPage.INPUT_EMAIL, value);
	}

	public void typeFirstName(String value) throws Exception {
		webDriverExtended.type(UserProfilesPage.INPUT_NEW_FIRST_NAME, value);
	}

	public void typeLastName(String value) throws Exception {
		webDriverExtended.type(UserProfilesPage.INPUT_NEW_LAST_NAME, value);
	}

	public void typeBirth(String value) throws Exception {
		webDriverExtended.type(UserProfilesPage.INPUT_NEW_BIRTH_DATE, value);
	}

	public void selectGender(int option) throws Exception {
		webDriverExtended.selectFromOneMenu(UserProfilesPage.BASE_RADIO_GENDER_ID, option);
	}

	public void typeSemester(String value) throws Exception {
		webDriverExtended.type(UserProfilesPage.INPUT_SEMESTER, value);
	}

	public void typeYear(String value) throws Exception {
		webDriverExtended.type(UserProfilesPage.INPUT_YEAR, value);
	}

	public void selectRole(int option) throws Exception {
		webDriverExtended.selectFromOneMenu(UserProfilesPage.BASE_SELECT_ROLES, option);
	}

	public void selectStatus(int option) throws Exception {
		webDriverExtended.selectFromOneMenu(UserProfilesPage.BASE_SELECT_STATUS, option);
	}

	public void typeDayPhone(String value) throws Exception {
		webDriverExtended.type(UserProfilesPage.INPUT_DAYTIME_PHONE, value);
	}

	public void typePassExp(String value) throws Exception {
		webDriverExtended.type(UserProfilesPage.INPUT_PASSWORD_EXPIRE, value);
	}

	public void PressCreateUser() throws Exception {
		System.out.println("Creating new user...");
		webDriverExtended.clickOnElement(UserProfilesPage.CREATE_USER_BUTTON);
		System.out.println("New user successfully created!");
	}

	public void checkUser() throws Exception {
		System.out.println("User check");
		webDriverExtended.clickOnElement(UserProfilesPage.CHECK_USER);

	}

	// SHOW USERS
	public void pressShowUsers() throws Exception {
		System.out.println("Showing users...");
		webDriverExtended.clickOnElement(UserProfilesPage.BUTTON_SHOW_USERS);
		webDriverExtended.scrollWithDownKey("//div[@id='usersForm:showDeletedUsers']/div[2]", 2, true);
	}

	public void setStatusToActive() throws Exception {
		webDriverExtended.clickOnElement(UserProfilesPage.BUTTON_SET_STATUS_TO);
		webDriverExtended.clickOnElement(UserProfilesPage.SET_STATUS_TO_ACTIVE);
		Thread.sleep(2000);

	}

	public void setStatusToLocked() throws Exception {
		webDriverExtended.clickOnElement(UserProfilesPage.BUTTON_SET_STATUS_TO);
		webDriverExtended.clickOnElement(UserProfilesPage.SET_STATUS_TO_LOCKED);
		Thread.sleep(2000);
	}

	public void setStatusToSuspended() throws Exception {
		webDriverExtended.clickOnElement(UserProfilesPage.BUTTON_SET_STATUS_TO);
		webDriverExtended.clickOnElement(UserProfilesPage.SET_STATUS_TO_SUSPENDED);
		Thread.sleep(2000);
	}

	public void setStatusToDeleted() throws Exception {
		webDriverExtended.clickOnElement(UserProfilesPage.BUTTON_SET_STATUS_TO);
		webDriverExtended.clickOnElement(UserProfilesPage.SET_STATUS_TO_DELETED);
		Thread.sleep(2000);
	}

	public void typeAddress(String value) throws Exception {
		webDriverExtended.type(UserProfilesPage.TYPE_ADDRESS, value);

	}

}
