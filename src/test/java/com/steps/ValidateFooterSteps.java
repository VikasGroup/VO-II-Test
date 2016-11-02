package com.steps;

import org.junit.Assert;

import com.voone.pgobjects.DashBoardVo2;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateFooterSteps extends BasicTest {
	DashBoardVo2 dashBoardVo2;

	@Then("^click on footer Privacy Policy$")
	public void click_on_footer_Privacy_Policy() throws Throwable {
		Thread.sleep(5000);
		dashBoardVo2 = new DashBoardVo2(driver);
		dashBoardVo2.clkFootPolicy();
	}

	@Then("^validate the privacy policy page$")
	public void validate_the_privacy_policy_page() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		Assert.assertEquals("http://www.qntest.com/en/footer/privacy_policy/", driver.getCurrentUrl());
	}

	@When("^change the vo(\\d+) language \"([^\"]*)\"$")
	public void change_the_vo_language(String arg2) throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);

	}

	@When("^click on footer Disclaimer$")
	public void click_on_footer_Disclaimer() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		dashBoardVo2.clkFootDis();
	}

	@When("^validate the Disclaimer page$")
	public void validate_the_Disclaimer_page() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		Assert.assertEquals("http://www.qntest.com/en/footer/disclaimer/", driver.getCurrentUrl());

	}

	@When("^click on footer Terms of Use$")
	public void click_on_footer_Terms_of_Use() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		dashBoardVo2.clkFootTerms();
	}

	@When("^validate the Terms of Use page$")
	public void validate_the_Terms_of_Use_page() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		Assert.assertEquals("http://www.qntest.com/en/footer/term_of_use/", driver.getCurrentUrl());
	}

	@When("^click on footer  Social Media Policy$")
	public void click_on_footer_Social_Media_Policy() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		dashBoardVo2.clkFootSmp();
	}

	@When("^validate the Social Media Policy page$")
	public void validate_the_Social_Media_Policy_page() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		Assert.assertEquals("http://www.qntest.com/en/footer/social_media_policy/", driver.getCurrentUrl());
	}

	@When("^click on footer  Code of Ethics$")
	public void click_on_footer_Code_of_Ethics() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		dashBoardVo2.clkFootCoe();
	}

	@When("^validate the Code of Ethics  page$")
	public void validate_the_Code_of_Ethics_page() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		Assert.assertEquals("http://www.qntest.com/en/footer/code_of_ethics/", driver.getCurrentUrl());
	}

	@When("^click on footer Earning and Income Disclaimer$")
	public void click_on_footer_Earning_and_Income_Disclaimer() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		dashBoardVo2.clkFootEar();
	}

	@When("^validate the Earning and Income Disclaimer page$")
	public void validate_the_Earning_and_Income_Disclaimer_page() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		Assert.assertEquals("http://www.qntest.com/en/footer/earnings_and_income_disclaimer/", driver.getCurrentUrl());
	}

	@When("^click on footer Contact Us$")
	public void click_on_footer_Contact_Us() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		dashBoardVo2.clkFootCont();
	}

	@When("^validate the Contact Us page$")
	public void validate_the_Contact_Us_page() throws Throwable {
		dashBoardVo2 = new DashBoardVo2(driver);
		Assert.assertEquals("http://www.qntest.com/en/company/support/", driver.getCurrentUrl());
	}
}
