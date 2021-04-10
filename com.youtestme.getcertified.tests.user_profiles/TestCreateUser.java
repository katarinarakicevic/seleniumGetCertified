package com.youtestme.getcertified.tests.user_profiles;

import org.testng.annotations.Test;

import com.youtestme.getcertified.core.BaseTest;
import com.youtestme.getcertified.core.pagehelpers.UserProfilesPageTestHelper;

public class TestCreateUser extends BaseTest {
	@Test
	public void test3CreateUserProfile() throws Exception {

		UserProfilesPageTestHelper profilesPageTestHelper = super.factory.createUserProfilesPageHelper();

		System.out.println("\n==== Start testing class TestCreateUser... ====");

		application.login().openUserProfilesPage();
		profilesPageTestHelper.pressNewUserPanel();
		//profilesPageTestHelper.basicInfo();
		// use this only in case if it is not checked by default
		//profilesPageTestHelper.updatePicture();
		
		profilesPageTestHelper.typeUsername("test001");
		profilesPageTestHelper.selectPasswordGenerated();
		profilesPageTestHelper.selectRole();
		profilesPageTestHelper.selectStatusActive();
		profilesPageTestHelper.typeFirstName("Test");
		profilesPageTestHelper.typeLastName("User");
		profilesPageTestHelper.typeEmail("usertester1512@gmail.com");
		profilesPageTestHelper.PressCreateUser();
		Thread.sleep(5000);

		application.logout();
		
		

}
}

