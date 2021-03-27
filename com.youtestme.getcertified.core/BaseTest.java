package com.youtestme.getcertified.core;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.youtestme.getcertified.core.pagehelpers.PageHelpersFactory;

/* Every test case should extend this class. */
public class BaseTest {

   public WebDriverExtended     webDriverExtended;
   public PageHelpersFactory    factory;
   public ApplicationController application;

   /* Done before test case */
   @BeforeMethod
   public void setUp() throws Exception {
      webDriverExtended = new WebDriverExtended();
      application = new ApplicationController(webDriverExtended);
      factory = PageHelpersFactory.getInstance(webDriverExtended);
   }

   /* Done after the test case */
   @AfterSuite
   public void tearDown() throws InterruptedException {
      webDriverExtended.close();
   }

   // Generator broja pitanja, tipa pitanja itd.
   public int numberGenerator(int min, int max) {
      return min + (int) (Math.random() * ((max - min) + 1));
   }

}
