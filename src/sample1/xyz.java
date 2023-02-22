package sample1;


	import static org.testng.Assert.assertEquals;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class xyz
	{
	static WebDriver driver =new ChromeDriver();

	public static void main(String[] args)
	{
	W1();
	IDMB();
	driver.quit();


	}

	public static void W1()
	{
	driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
	String actreceivedate= driver.findElement(By.xpath("//div[text()='Release date']")).getText();

	String actreceivedateval= driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")).getText();

	String actcountry= driver.findElement(By.xpath("//table/tbody/tr/th[text()='Country']")).getText();
	String actcountryval= driver.findElement(By.xpath("//table/tbody/tr/td[text()='India']")).getText();

	System.out.println(actreceivedate);
	System.out.println(actreceivedateval);
	System.out.println(actcountry);
	System.out.println(actcountryval);
	String Expreceivedateval ="17 December 2021";
	String Expcountryval = "India";
	String msg="TC PASS:wiki Receive date is same as expected";

	//assert.assertEquals(actreceivedateval, Expreceivedateval, );

	if (actreceivedateval.equals(Expreceivedateval))
	{
	System.out.println("TC PASS:wiki Receive date is same as expected");
	}
	else
	{
	System.out.println("TC FAIL :wiki Receive date is not same as expected");
	}



	if (Expcountryval.equals(actcountryval))
	{
	System.out.println("TC PASS:wiki Countryval is same as expected");
	}
	else
	{
	System.out.println("TC FAIL :wiki countryval is not same as expected");
	}
	}

	
	
	public static void IDMB() {
		driver.get("https://www.imdb.com/title/tt9389998/");
		String imdbactreceivedate= driver.findElement(By.xpath("//a[text()='Release date']")).getText();

		String imdbactreceivedateval= driver.findElement(By.xpath("//a[text()='December 17, 2021 (United States)']")).getText();
		//
		String imdbactcountry= driver.findElement(By.xpath("//button[text()='Country of origin']")).getText();
		String imdbactcountryval= driver.findElement(By.xpath("//a[text()='India']")).getText();

		System.out.println(imdbactreceivedate);
		System.out.println(imdbactreceivedateval);
		System.out.println(imdbactcountry);
		System.out.println(imdbactcountryval);
		String imdbExpreceivedateval ="December 17, 2021 (United States)";
		String imdbExpcountryval = "India";
		String msg="TC PASS:wiki Receive date is same as expected";

		//assert.assertEquals(actreceivedateval, Expreceivedateval, );

		if (imdbactreceivedateval.equals(imdbExpreceivedateval))
		{
		System.out.println("TC PASS:wiki Receive date is same as expected");
		}
		else
		{
		System.out.println("TC FAIL :wiki Receive date is not same as expected");
		}



		if (imdbExpcountryval.equals(imdbactcountryval))
		{
		System.out.println("TC PASS:wiki Countryval is same as expected");
		}
		else
		{
		System.out.println("TC FAIL :wiki countryval is not same as expected");
		}




		}


		}


