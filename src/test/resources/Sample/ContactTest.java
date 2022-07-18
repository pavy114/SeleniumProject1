package Sample;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ContactTest {
	
	@Test (groups = "smoke")
	public void createContact()
	{
		System.out.println("Inside Create Contact");
		System.out.println("smoke test");
		System.out.println("regional testing1");
	}

	
	@Test (groups ="regression")
	public void createContactWithOrganization()
	{
		System.out.println("Inside Create Contact with Organization");
		System.out.println("regression test");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void createContactAndEdit()
	{
		System.out.println("Inside Create Contact And Edit");
		System.out.println("smoke test and regression");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void createContactwithIndustryt()
	{
		System.out.println("give industryhdjd name");
		System.out.println("Amit enterprises with number 8447995256   ");
		System.out.println("pavitra with 123456789..");
		
		System.out.println("savegfh");
		System.out.println("hii");
		System.out.println("jhgtfrh....mmmm..");
		
		System.out.println("savegfh");
		System.out.println("hii");
		System.out.println("jhgtfrh....mmmm..");
		System.out.println("Latest build testing.........");
		
		
		
	}
}
