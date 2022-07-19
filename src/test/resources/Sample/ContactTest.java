package Sample;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ContactTest {
	
	@Test //(groups = "smoke")
	public void createContact()
	{
		System.out.println("Inside Create Contact");
		System.out.println("Jenkins test");
		System.out.println("regional testing1");
		String Browser=System.getProperty(BROWSER);
		System.out.println("Browser is = " +Browser);
		String Url=System.getProperty(URL);
		System.out.println("URL is = " +Url);
		
	}

	
	@Test // (groups ="regression")
	public void createContactWithOrganization()
	{
		System.out.println("Inside Create Contact with Organization");
		System.out.println("regression test");
	}
	
	@Test //(groups = {"smoke", "regression"})
	public void createContactAndEdit()
	{
		System.out.println("Inside Create Contact And Edit");
		System.out.println("smoke test and regression");
	}
	
	@Test //(groups = {"smoke", "regression"})
	public void createContactwithIndustryt()
	{
		System.out.println("give industryhdjd name");
		System.out.println("Amit enterprises with number 8447995256   ");
		System.out.println("pavitra with 123456..");
		
		System.out.println("savegfh");
		System.out.println("hii");
		System.out.println("jhgkuj");
	}
}
