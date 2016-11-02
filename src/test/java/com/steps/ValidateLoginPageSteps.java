package com.steps;

import java.util.ArrayList;

import org.junit.Assert;

import com.pbo.pgobjects.CustomerMgtMenuPgObjects;
import com.pbo.pgobjects.PortalBackOfficePgObject;
import com.pbo.pgobjects.VerifyTokenPgObject;
import com.util.LanDetector;
import com.voone.pgobjects.BetaAccountLoginPgObject;
import com.voone.pgobjects.ForgotPasswordPgObject;
import com.voone.pgobjects.LoginPgObject;
import com.voone.pgobjects.QntestPgObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateLoginPageSteps extends BasicTest {
	LanDetector lanDetector;
	QntestPgObject qntestPgObject;
	LoginPgObject loginPgObject;
	BetaAccountLoginPgObject betaAccountLoginPgObject;
	PortalBackOfficePgObject portalBackOfficePgObject;
	VerifyTokenPgObject verifyTokenPgObject;
	CustomerMgtMenuPgObjects customerMgtMenuPgObjects;
	ForgotPasswordPgObject forgotPasswordPgObject;

	@Given("^User opens \"([^\"]*)\" home page$")
	public void user_opens_home_page(String plan) throws Throwable {
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
	}

	@Given("^click on IR login$")
	public void click_on_IR_login() throws Throwable {
		qntestPgObject = new QntestPgObject(driver);
		qntestPgObject.clickIRLogiIn();

	}

	@Given("^select beta VO$")
	public void select_beta_VO() throws Throwable {
		loginPgObject = new LoginPgObject(driver);
		loginPgObject.clickVo2();
		Thread.sleep(2000);
	}

	@Given("^select language \"([^\"]*)\"$")
	public void select_language(String arg1) throws Throwable {
		betaAccountLoginPgObject = new BetaAccountLoginPgObject(driver);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		betaAccountLoginPgObject.selectLang(arg1);
	}

	@When("^validate the vo(\\d+) dashboard page$")
	public void validate_the_vo_dashboard_page(int arg1) throws Throwable {
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals("https://portal.qntest.com/singaporebeta/#/DashBoard", driver.getCurrentUrl());
	}

	@When("^validate the error messages$")
	public void validate_the_error_messages() throws Throwable {
		betaAccountLoginPgObject = new BetaAccountLoginPgObject(driver);
		betaAccountLoginPgObject.chkInvalidCred();
	}

	@When("^validate the unauthorised error messages$")
	public void validate_the_unauthorised_error_messages() throws Throwable {
		betaAccountLoginPgObject = new BetaAccountLoginPgObject(driver);
		betaAccountLoginPgObject.checkBlankCred();
	}
	
	@Given("^user opens PBO page$")
	public void user_opens_PBO_page() throws Throwable {
		System.out.println(prop.getProperty("url2"));
		driver.get(prop.getProperty("url2"));

	}

	@Given("^enter IR ID password and login \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_IR_ID_password_and_login(String arg1, String arg2) throws Throwable {
		betaAccountLoginPgObject = new BetaAccountLoginPgObject(driver);
		betaAccountLoginPgObject.enterBIrId(arg1);
		betaAccountLoginPgObject.enterBPwd(arg2);
		Thread.sleep(1000);
		betaAccountLoginPgObject.clickBlogin();
		Thread.sleep(1000);
	}

	@Given("^enter username and password \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_username_and_password(String arg1, String arg2) throws Throwable {
		portalBackOfficePgObject = new PortalBackOfficePgObject(driver);
		portalBackOfficePgObject.enterid(arg1);
		portalBackOfficePgObject.enterPWD(arg2);
		portalBackOfficePgObject.clicksubmit();
	}

	@Given("^Enter token key$")
	public void enter_token_key() throws Throwable {
		verifyTokenPgObject = new VerifyTokenPgObject(driver);
		verifyTokenPgObject.EnterToken();
		verifyTokenPgObject.clickSubmit();

	}

	@When("^Enter irid and crfNo \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_irid_and_crfNo(String arg1, String arg2) throws Throwable {
		customerMgtMenuPgObjects = new CustomerMgtMenuPgObjects(driver);
		customerMgtMenuPgObjects.enterIRID(arg1);
		customerMgtMenuPgObjects.enterCrf(arg2);
	}

	@When("^click on vo(\\d+) link$")
	public void click_on_vo_link(int arg1) throws Throwable {
		customerMgtMenuPgObjects.clickVO2();
		Thread.sleep(10000);
	}

	@When("^varify PVO(\\d+)\\.(\\d+) Dashboard$")
	public void varify_PVO_Dashboard(int arg1, int arg2) throws Throwable {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.switchTo().window(tabs2.get(0)).close();
		Thread.sleep(2000);
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
		Assert.assertEquals("https://portal.qntest.com/singaporebeta/#/DashBoard", driver.getCurrentUrl());
	}

	@When("^slect enroll as IR$")
	public void slect_enroll_as_IR() throws Throwable {
		betaAccountLoginPgObject = new BetaAccountLoginPgObject(driver);
		betaAccountLoginPgObject.enrollAsIR();
		Thread.sleep(4000);
	}

	@When("^validate the referrer info page$")
	public void validate_the_referrer_info_page() throws Throwable {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.switchTo().window(tabs2.get(0)).close();
		Thread.sleep(2000);
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
		Assert.assertEquals("https://portal.qntest.com/eStore/preregister.aspx?referrer=", driver.getCurrentUrl());
	}

	@When("^slect shop as RC$")
	public void slect_shop_as_RC() throws Throwable {
		betaAccountLoginPgObject = new BetaAccountLoginPgObject(driver);
		betaAccountLoginPgObject.shopAsRC();
		Thread.sleep(4000);
	}

	@When("^validate the info referrer detail page$")
	public void validate_the_info_referrer_detail_page() throws Throwable {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.switchTo().window(tabs2.get(0)).close();
		Thread.sleep(2000);
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
		Assert.assertEquals("https://portal.qntest.com/eStore/verifyreferrer.aspx", driver.getCurrentUrl());

	}

	@When("^slect forgot password link$")
	public void slect_forgot_password_link() throws Throwable {
		betaAccountLoginPgObject = new BetaAccountLoginPgObject(driver);
		betaAccountLoginPgObject.clickForPwd();
		Thread.sleep(3000);
	}

	@When("^validate the reset password page$")
	public void validate_the_reset_password_page() throws Throwable {
		Assert.assertEquals("https://portal.qntest.com/SingaporeBeta/Account/ForgotPassword/#/ForgotPassword/-/EN",
				driver.getCurrentUrl());
		Thread.sleep(1000);

	}
	@Then("^Enter IR ID to reset \"([^\"]*)\"$")
	public void enter_IR_ID_to_reset(String arg1) throws Throwable {
	    forgotPasswordPgObject = new ForgotPasswordPgObject(driver);
	   forgotPasswordPgObject.resetIRID(arg1);
	}

	@Then("^click submit$")
	public void click_submit() throws Throwable {
	 forgotPasswordPgObject.clickSubmit();
	}
	

@Then("^verify error message for reset pwd$")
public void verify_error_message_for_reset_pwd() throws Throwable {
   
}

@Then("^verify success message for reset pwd$")
public void verify_success_message_for_reset_pwd() throws Throwable {
 Thread.sleep(5000);
 Assert.assertEquals("https://portal.qntest.com/SingaporeBeta/Account/ForgotPassword/#/ForgotPassword/-/EN", driver.getCurrentUrl());
}
}
