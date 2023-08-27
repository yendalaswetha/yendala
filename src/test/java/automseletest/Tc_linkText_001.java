package automseletest;

import org.testng.annotations.Test;

import automations.BaseClass;

public class Tc_linkText_001 extends BaseClass{

	@Test
	public void linkTest()  {
		driver.get("https://uat.vcard.ai/vmod/checkEligibility");
		
	}
}
