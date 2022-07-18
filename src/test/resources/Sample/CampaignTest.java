package Sample;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class CampaignTest {
	
	@Test(groups = "smoke")
	public void createCampaign()
	{
		System.out.println("go to the campaign module");
		System.out.println("click on the campaign module");
	}

	
	@Test (groups = "regression")
	public void createCampaignWithOrganization()
	{
		System.out.println("click on the campaign module");
		System.out.println("inside the campaign module click on the organization module");
		System.out.println("click on the organizzation module sucessfully");
	}
	
	@Test (groups = {"smoke", "regression"})
	public void createCampaignAndEdit()
	{
		System.out.println("create campaign done ");
		System.out.println("click on the edit one ");
		System.out.println("edit sucessfully");
		
	}
}
