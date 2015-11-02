package galepackage;

import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
public class NewTest1 {
	
	public WebDriver driver= new FirefoxDriver();
	public String baseUrl="http://questionpro.com/survey-templates/evaluation-of-potential-for-e-commerce-services";
	

	@Test
  public void first() {
		//Verify that the URL opens the page
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Verify the title of the page
		String actualText = driver.findElement(By.xpath("/html/body/section/div/div[1]/h3/span")).getText();
		Assert.assertEquals(actualText, "Here is the Evaluation of Potential for E-Commerce Services template.");
		
		//Verify that the answer option is present
		driver.findElement(By.xpath("//*[@id='AnswerRow_411']/table/tbody/tr/td[2]/span/div")).getText().contains("Everyday");
		
		//Verify the presence of radio button
        boolean radiobuttonPresence=driver.findElement(By.id("411ID")).isDisplayed();
        System.out.println(radiobuttonPresence);
        
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText().contains("Once a week");
        boolean radiobuttonPresence1 = driver.findElement(By.id("142632ID")).isDisplayed();
        System.out.println(radiobuttonPresence1);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[3]/td/label")).getText().contains("Once in two weeks");
        boolean radiobuttonPresence2= driver.findElement(By.id("142633ID")).isDisplayed();
        System.out.println(radiobuttonPresence2);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[4]/td/label")).getText().contains("Once a month");
        boolean radiobuttonPresence3= driver.findElement(By.id("142634ID")).isDisplayed();
        System.out.println(radiobuttonPresence3);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[5]/td/label")).getText().contains("Rarely");
        boolean radiobuttonPresence4= driver.findElement(By.id("142635ID")).isDisplayed();
        System.out.println(radiobuttonPresence4);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[6]/td/label")).getText().contains("Other");
        boolean radiobuttonPresence5= driver.findElement(By.id("4560321ID")).isDisplayed();
        System.out.println(radiobuttonPresence5);
        
        //Verify the presence of text box
        boolean textboxPresence=driver.findElement(By.name("t_4560321")).isDisplayed();
        System.out.println(textboxPresence);
        
        //Verify that the radio buttons are not accepting more than one select
        driver.findElement(By.id("411ID")).click(); // select Everyday radio button
        // now we will check if everyday radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("411ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("//*[@id='AnswerRow_411']/table/tbody/tr/td[2]/span/div")).getText()+" "+"radio is selected" );
            }
        
        //Asserts to verify the selection of radio buttons
        driver.findElement(By.id("142632ID")).click();//select Once in a week radio button
     // now we will check if radio button 'once in a week' is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("142632ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText()+" "+"radio is selected" );
        }
        else
        	System.out.println("once in a week radio not selected");
        //we verify if the 'Everyday' radio button is unselected
        if(driver.findElement(By.id("411ID")).isSelected()){
        	System.out.println(driver.findElement(By.xpath("//*[@id='AnswerRow_411']/table/tbody/tr/td[2]/span/div")).getText()+" "+"radio is selected" );
        }
        else 
        	System.out.println("Once I have selected the second radio button,first radio button gets unselected");
	}
	@Test(priority=1)
	public void second(){
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//Verify that the answer option is present
	driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[6]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText().contains("Office");
	//Verify the presence of radio button
    boolean radiobuttonPresence=driver.findElement(By.id("412ID")).isDisplayed();
    System.out.println(radiobuttonPresence);
    
    driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[6]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText().contains("Home (including a home office)");
    boolean radiobuttonPresence1 = driver.findElement(By.id("413ID")).isDisplayed();
    System.out.println(radiobuttonPresence1);
    
    driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[6]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[3]/td/label")).getText().contains("Equally from the home and office");
    boolean radiobuttonPresence2= driver.findElement(By.id("414ID")).isDisplayed();
    System.out.println(radiobuttonPresence2);
    
    driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[6]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[4]/td/label")).getText().contains("Other");
    boolean radiobuttonPresence3= driver.findElement(By.id("4560322ID")).isDisplayed();
    System.out.println(radiobuttonPresence3);
    
    //Verify the presence of text box
    boolean textboxPresence=driver.findElement(By.name("t_4560322")).isDisplayed();
    System.out.println(textboxPresence);
    
    driver.findElement(By.id("412ID")).click(); // select Office radio button
    // now we will check if office radio button is selected or not? if selected then text besides that radio button will print
    if(driver.findElement(By.id("412ID")).isSelected()){
        System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[6]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected" );
        }
    //Asserts to verify the selection of radio buttons
    driver.findElement(By.id("413ID")).click();
 // now we will check if radio button 'Home (including a home office)' is selected or not? if selected then text besides that radio button will print
    if(driver.findElement(By.id("413ID")).isSelected()){
        System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[6]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText()+" "+"radio is selected" );
    }
    else
    	System.out.println("Home (including a home office) radio not selected");
    //we verify if the 'office' radio button is unselected
    if(driver.findElement(By.id("412ID")).isSelected()){
        System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[6]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected" );
    }
    else
    	System.out.println("Once I have selected the second radio button,first radio button gets unselected");
    }
	@Test(priority=2)
	public void third(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Verify that the answer option is present
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText().contains("Looking for general information");
		//Verify the presence of check box
		boolean checkboxPresence=driver.findElement(By.id("4560323ID")).isDisplayed();
		System.out.println(checkboxPresence);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText().contains("Looking for rules/regulations");
		boolean checkboxPresence1=driver.findElement(By.id("4560324ID")).isDisplayed();
		System.out.println(checkboxPresence1);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[3]/td/label")).getText().contains("Looking for forms");
		boolean checkboxPresence2=driver.findElement(By.id("4560325ID")).isDisplayed();
		System.out.println(checkboxPresence2);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[4]/td/label")).getText().contains("Looking for facility information");
		boolean checkboxPresence3=driver.findElement(By.id("4560326ID")).isDisplayed();
		System.out.println(checkboxPresence3);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[5]/td/label")).getText().contains("Looking for regulatory information");
		boolean checkboxPresence4=driver.findElement(By.id("4560327ID")).isDisplayed();
		System.out.println(checkboxPresence4);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[6]/td/label")).getText().contains("Looking for Upgrade Information");
		boolean checkboxPresence5=driver.findElement(By.id("4560328ID")).isDisplayed();
		System.out.println(checkboxPresence5);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[7]/td/label")).getText().contains("Looking for Qualified Professional/Consultant Information");
		boolean checkboxPresence6=driver.findElement(By.id("4560329ID")).isDisplayed();
		System.out.println(checkboxPresence6);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[8]/td/label")).getText().contains("Looking for news (Meetings, Seminars, Calendar, Public Hearings etc)");
		boolean checkboxPresence7=driver.findElement(By.id("4560330ID")).isDisplayed();
		System.out.println(checkboxPresence7);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[9]/td/label")).getText().contains("Looking for Contact Information (Agency and Staff Phone #s, Mailing Address etc)");
		boolean checkboxPresence8=driver.findElement(By.id("4560331ID")).isDisplayed();
		System.out.println(checkboxPresence8);
		
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[10]/td/label")).getText().contains("Research for Work");
		boolean checkboxPresence9=driver.findElement(By.id("4560332ID")).isDisplayed();
		System.out.println(checkboxPresence9);
		
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[11]/td/label")).getText().contains("Research for School");
		boolean checkboxPresence10=driver.findElement(By.id("4560333ID")).isDisplayed();
		System.out.println(checkboxPresence10);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[12]/td/label")).getText().contains("Download files");
		boolean checkboxPresence11=driver.findElement(By.id("4560334ID")).isDisplayed();
		System.out.println(checkboxPresence11);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[13]/td/label")).getText().contains("Professional Development");
		boolean checkboxPresence12=driver.findElement(By.id("4560335ID")).isDisplayed();
		System.out.println(checkboxPresence12);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[14]/td/label")).getText().contains("Looking for update on earlier information");
		boolean checkboxPresence13=driver.findElement(By.id("4560336ID")).isDisplayed();
		System.out.println(checkboxPresence13);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[8]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[15]/td/label")).getText().contains("Other");
		boolean checkboxPresence14=driver.findElement(By.id("4560337ID")).isDisplayed();
		System.out.println(checkboxPresence14);
		
		//Verify the presence of text box
		boolean textboxPresence=driver.findElement(By.name("t_4560337")).isDisplayed();
        System.out.println(textboxPresence);
        
        //Asserts to verify the selection of check boxes
        driver.findElement(By.id("4560323ID")).click();// select the checkbox'looking for general information'
        driver.findElement(By.id("4560324ID")).click();// select the checkbox'looking for rules/regulations'
        
     // now we will check the checkbox'looking for general information' is checked or not
        String str1 = driver.findElement(By.id("4560323ID")).getAttribute("checked");
        if (str1.equalsIgnoreCase("true"))
        {
            System.out.println("First Checkbox selected");
        }
     // now we will check the checkbox 'looking for rules/regulations' is checked or not
        String str2 = driver.findElement(By.id("4560324ID")).getAttribute("checked");
        if (str2.equalsIgnoreCase("true"))
        {
            System.out.println("Second Checkbox also selected");
            System.out.println("Mutliple Selections can be performed");
        }
	}
	@Test(priority=3)
	public void fourth(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Verify that the answer option is present
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText().contains("Payment of _____ fees");
		//Verify the presence of check box
		boolean checkboxPresence=driver.findElement(By.id("4560342ID")).isDisplayed();
		System.out.println(checkboxPresence);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText().contains("Payment of _____ fees");
		boolean checkboxPresence1=driver.findElement(By.id("4560343ID")).isDisplayed();
		System.out.println(checkboxPresence1);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[3]/td/label")).getText().contains("Payment of plan review fees");
		boolean checkboxPresence2=driver.findElement(By.id("4560344ID")).isDisplayed();
		System.out.println(checkboxPresence2);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[4]/td/label")).getText().contains("Payment of _____ application fees");
		boolean checkboxPresence3=driver.findElement(By.id("4560345ID")).isDisplayed();
		System.out.println(checkboxPresence3);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[5]/td/label")).getText().contains("Payment of _____ related charges");
		boolean checkboxPresence4=driver.findElement(By.id("4560346ID")).isDisplayed();
		System.out.println(checkboxPresence4);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[6]/td/label")).getText().contains("Submission of reports, such as _____, _____, site assessments etc");
		boolean checkboxPresence5=driver.findElement(By.id("4560347ID")).isDisplayed();
		System.out.println(checkboxPresence5);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[7]/td/label")).getText().contains("Registration of _____");
		boolean checkboxPresence6=driver.findElement(By.id("4560348ID")).isDisplayed();
		System.out.println(checkboxPresence6);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[8]/td/label")).getText().contains("Register for seminars and expos");
		boolean checkboxPresence7=driver.findElement(By.id("4560349ID")).isDisplayed();
		System.out.println(checkboxPresence7);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[9]/td/label")).getText().contains("_____ application process");
		boolean checkboxPresence8=driver.findElement(By.id("4560350ID")).isDisplayed();
		System.out.println(checkboxPresence8);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[10]/td/label")).getText().contains("Overnight shipping and handling charges for important documents/reports");
		boolean checkboxPresence9=driver.findElement(By.id("4560351ID")).isDisplayed();
		System.out.println(checkboxPresence9);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[10]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[11]/td/label")).getText().contains("Other (please specify)");
		boolean checkboxPresence10=driver.findElement(By.id("4560352ID")).isDisplayed();
		System.out.println(checkboxPresence10);
		
		//Verify the presence of text box
		boolean textboxPresence=driver.findElement(By.name("t_4560352")).isDisplayed();
        System.out.println(textboxPresence);
        
        //Asserts to verify the selection of check boxes
        driver.findElement(By.id("4560342ID")).click();// select the checkbox'Payment of fees'
        driver.findElement(By.id("4560343ID")).click();// select the checkbox'Payment of fees'
        driver.findElement(By.id("4560352ID")).click();// select the checkbox'Other'
     // now we will check the checkbox'Payment of fees' is checked or not
        String str1 = driver.findElement(By.id("4560342ID")).getAttribute("checked");
        if (str1.equalsIgnoreCase("true"))
        {
            System.out.println("First Checkbox selected");
        }
     // now we will check the checkbox'Payment of fees' is checked or not
        String str2 = driver.findElement(By.id("4560343ID")).getAttribute("checked");
        if (str2.equalsIgnoreCase("true"))
        {
            System.out.println("Second Checkbox also selected");
        }
     // now we will check the checkbox'Other' is checked or not
        String str3 = driver.findElement(By.id("4560352ID")).getAttribute("checked");
        if (str3.equalsIgnoreCase("true"))
        {
            System.out.println("Last Checkbox also selected");
            System.out.println("Mutliple Selections can be performed");
        }
        //now we verify if the check box 'other' when selected takes in input to the text box present
        driver.findElement(By.id("qWidthCtrl_4560352")).sendKeys("OverHead costs.");
	}
	@Test(priority=4)
	public void fifth(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Verify that the answer option is present
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[12]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText().contains("Very attractive");
		//Verify the presence of radio button
		boolean radiobuttonPresence=driver.findElement(By.id("440ID")).isDisplayed();
		System.out.println(radiobuttonPresence);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[12]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText().contains("Somewhat attractive");
		boolean radiobuttonPresence1=driver.findElement(By.id("441ID")).isDisplayed();
		System.out.println(radiobuttonPresence1);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[12]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[3]/td/label")).getText().contains("Average");
		boolean radiobuttonPresence2=driver.findElement(By.id("442ID")).isDisplayed();
		System.out.println(radiobuttonPresence2);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[12]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[4]/td/label")).getText().contains("Not very attractive");
		boolean radiobuttonPresence3=driver.findElement(By.id("443ID")).isDisplayed();
		System.out.println(radiobuttonPresence3);
		
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[12]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[5]/td/label")).getText().contains("Not attractive at all");
		boolean radiobuttonPresence4=driver.findElement(By.id("444ID")).isDisplayed();
		System.out.println(radiobuttonPresence4);
		
		//Asserts to verify the selection of radio button
		driver.findElement(By.id("440ID")).click(); //Select 'Very attractive' radio button
		// now we will check if 'Very attractive' radio button is selected or not? if selected then text besides that radio button will print
		if (driver.findElement(By.id("440ID")).isSelected())
		{
			System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[12]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected");
		}
		driver.findElement(By.id("441ID")).click();//Select 'Somewhat attractive' radio button
		// now we will check if 'Somewhat attractive' radio button is selected or not? if selected then text besides that radio button will print
		if (driver.findElement(By.id("441ID")).isSelected()){
			System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[12]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText()+" "+"radio is selected");
		}
		else
			System.out.println("Somewhat attractive radiobutton not selected");
		//We verify if the radio button 'Very attractive' is unselected
		if (driver.findElement(By.id("441ID")).isSelected()){
			System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[12]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected");
		}
		else
			System.out.println("once i have selected the second radio button, first radio button gets unselected");
	}
	
	@Test(priority=5)
	public void sixth(){
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Verify that the answer option is present
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[14]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText().contains("A lot less than I expected");
		//Verify the presence of radio button
        boolean radiobuttonPresence=driver.findElement(By.id("447ID")).isDisplayed();
        System.out.println(radiobuttonPresence);
		
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[14]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText().contains("Less than I expected");
        boolean radiobuttonPresence1=driver.findElement(By.id("448ID")).isDisplayed();
        System.out.println(radiobuttonPresence1);
		
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[14]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[3]/td/label")).getText().contains("About what I expected");
		boolean radiobuttonPresence2=driver.findElement(By.id("449ID")).isDisplayed();
        System.out.println(radiobuttonPresence2);
		
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[14]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[4]/td/label")).getText().contains("More than I expected");
		boolean radiobuttonPresence3=driver.findElement(By.id("450ID")).isDisplayed();
        System.out.println(radiobuttonPresence3);
		
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[14]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[5]/td/label")).getText().contains("A lot more than I expected");
		boolean radiobuttonPresence4=driver.findElement(By.id("451ID")).isDisplayed();
        System.out.println(radiobuttonPresence4);
        
        //Asserts to verify the selection of radio buttons
        driver.findElement(By.id("447ID")).click(); //Select 'A lot less than I expected' radio button
     // now we will check if 'A lot less than I expected' radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("447ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[14]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected");
            }
        driver.findElement(By.id("448ID")).click(); //Select 'Less than I expected' radio button
     // now we will check if 'Less than I expected' radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("448ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[14]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText()+" "+"radio is selected");
        }
        else
        	System.out.println("Less than I expected radio not selected");
        //We verify if the radio button 'A lot less than I expected' is unselected 
        if(driver.findElement(By.id("447ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[14]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected" );
            }
        else
        	System.out.println("once i have selected the second radio button, first radio button gets unselected");
        }
	@Test(priority=6)
	public void seventh(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Verify that the answer option is present
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[16]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]")).getText().contains("Visual appearance/layout:");
		//Verify the presence of radio button
        boolean radiobuttonPresence=driver.findElement(By.id("batteryOption_456")).isDisplayed();
        System.out.println(radiobuttonPresence);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[16]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td[1]")).getText().contains("Content:");
		boolean radiobuttonPresence1=driver.findElement(By.id("batteryOption_461")).isDisplayed();
        System.out.println(radiobuttonPresence1);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[16]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1]")).getText().contains("Writing style:");
        boolean radiobuttonPresence2=driver.findElement(By.id("batteryOption_466")).isDisplayed();
        System.out.println(radiobuttonPresence2);
        
        //Asserts to verify the selection of radio button
        driver.findElement(By.id("batteryOption_456")).click(); 
        driver.findElement(By.id("batteryOption_461")).click(); 
        driver.findElement(By.id("batteryOption_466")).click(); 
		if(driver.findElement(By.id("batteryOption_456")).isSelected()){
			System.out.println("Excellent radio button selected");
		}
		if(driver.findElement(By.id("batteryOption_461")).isSelected()){
			System.out.println("Excellent radio button selected");
		}
		if(driver.findElement(By.id("batteryOption_466")).isSelected()){
			System.out.println("Excellent radio button selected");
		}
	}
	@Test(priority=7)
	public void eighth(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Verify that the answer option is present
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText().contains("I am new to the Internet");
		//Verify the presence of radio button
        boolean radiobuttonPresence=driver.findElement(By.id("467ID")).isDisplayed();
        System.out.println(radiobuttonPresence);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText().contains("Information I am looking is not available");
        boolean radiobuttonPresence1=driver.findElement(By.id("468ID")).isDisplayed();
        System.out.println(radiobuttonPresence1);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[3]/td/label")).getText().contains("Information is not well organized");
        boolean radiobuttonPresence2=driver.findElement(By.id("469ID")).isDisplayed();
        System.out.println(radiobuttonPresence2);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[4]/td/label")).getText().contains("There is just too much information");
        boolean radiobuttonPresence3=driver.findElement(By.id("470ID")).isDisplayed();
        System.out.println(radiobuttonPresence3);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[5]/td/label")).getText().contains("Hard to navigate through the information");
		boolean radiobuttonPresence4=driver.findElement(By.id("471ID")).isDisplayed();
        System.out.println(radiobuttonPresence4);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[6]/td/label")).getText().contains("Takes too long to load a page");
		boolean radiobuttonPresence5=driver.findElement(By.id("472ID")).isDisplayed();
        System.out.println(radiobuttonPresence5);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[7]/td/label")).getText().contains("Downloadable files or forms are in a format I cannot use");
		boolean radiobuttonPresence6=driver.findElement(By.id("473ID")).isDisplayed();
        System.out.println(radiobuttonPresence6);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[8]/td/label")).getText().contains("Other (please specify)");
		boolean radiobuttonPresence7=driver.findElement(By.id("4560356ID")).isDisplayed();
        System.out.println(radiobuttonPresence7);
        
        //Verify the presence of text box
        boolean textboxPresence=driver.findElement(By.name("t_4560356")).isDisplayed();
        System.out.println(textboxPresence);
		
        //Asserts to verify the selection of radio buttons
        driver.findElement(By.id("467ID")).click(); //Select 'I am new to the Internet' radio button
        // now we will check if 'I am new to the Internet' radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("467ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected");
            }
        driver.findElement(By.id("468ID")).click(); //Select 'Information I am looking is not available' radio button
     // now we will check if 'Information I am looking is not available' radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("468ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText()+" "+"radio is selected");
        }
        else
        	System.out.println("radio not selected");
        //We verify if the radio button 'I am new to the Internet' is unselected
        if(driver.findElement(By.id("467ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[18]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected");
            }
        else
        	System.out.println("once i have selected the second radio button, first radio button gets unselected");
	
	}
	@Test(priority=8)
	public void ninth(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Verify that the answer option is present
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[20]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText().contains("Yes");
		//Verify that the radio button is present
        boolean radiobuttonPresence=driver.findElement(By.id("477ID")).isDisplayed();
        System.out.println(radiobuttonPresence);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[20]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText().contains("No");
		boolean radiobuttonPresence1=driver.findElement(By.id("478ID")).isDisplayed();
        System.out.println(radiobuttonPresence1);
        
        //Asserts to verify the selection of radio button
        driver.findElement(By.id("477ID")).click(); //Select 'Yes' radio button
        //now we will check if 'Yes' radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("477ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[20]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected");
            }
        driver.findElement(By.id("478ID")).click(); //Select 'No' radio button
        //now we will check if 'No' radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("478ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[20]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText()+" "+"radio is selected");
        }
        else
        	System.out.println("'No' radio not selected");
        //We verify if the radio button 'Yes' is unselected
        if(driver.findElement(By.id("477ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[20]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected" );
            }
        else
        	System.out.println("once i have selected the second radio button, first radio button gets unselected");
	
	}
	@Test(priority=9)
	public void tenth(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Verify that the answer option is present
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[22]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText().contains("Yes");
		//Verify that the radio button is present
        boolean radiobuttonPresence=driver.findElement(By.id("480ID")).isDisplayed();
        System.out.println(radiobuttonPresence);
        
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[22]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText().contains("No");
		boolean radiobuttonPresence1=driver.findElement(By.id("481ID")).isDisplayed();
        System.out.println(radiobuttonPresence1);
        
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[22]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[3]/td/label")).getText().contains("Did not try");
		boolean radiobuttonPresence2=driver.findElement(By.id("482ID")).isDisplayed();
        System.out.println(radiobuttonPresence2);
        
        //Asserts to verify the selection of radio buttons
        driver.findElement(By.id("480ID")).click(); //Select 'Yes' radio button
        //now we will check if 'Yes' radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("480ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[22]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected");
            }
        driver.findElement(By.id("481ID")).click(); //Select 'No' radio button
        //now we will check if 'No' radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("481ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[22]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText()+" "+"radio is selected");
        }
        else
        	System.out.println("'No' radio not selected");
        //We verify if the radio button 'Yes' is unselected
        if(driver.findElement(By.id("480ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[22]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected" );
            }
        else
        	System.out.println("once i have selected the second radio button, first radio button gets unselected");
	}
	
	
	
	@Test(priority=10)
	public void eleventh(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Verify that the answer option is present
		driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText().contains("Literature: list source here");
		//Verify that the radio button is present
        boolean radiobuttonPresence=driver.findElement(By.id("484ID")).isDisplayed();
        System.out.println(radiobuttonPresence);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[2]/td/label")).getText().contains("Literature: list source here");
		boolean radiobuttonPresence1=driver.findElement(By.id("485ID")).isDisplayed();
        System.out.println(radiobuttonPresence1);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[3]/td/label")).getText().contains("Literature: list source here");
		boolean radiobuttonPresence2=driver.findElement(By.id("486ID")).isDisplayed();
        System.out.println(radiobuttonPresence2);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[4]/td/label")).getText().contains("Literature: list source here");
		boolean radiobuttonPresence3=driver.findElement(By.id("487ID")).isDisplayed();
        System.out.println(radiobuttonPresence3);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[5]/td/label")).getText().contains("Hotline");
		boolean radiobuttonPresence4=driver.findElement(By.id("488ID")).isDisplayed();
        System.out.println(radiobuttonPresence4);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[6]/td/label")).getText().contains("Dealer");
		boolean radiobuttonPresence5=driver.findElement(By.id("489ID")).isDisplayed();
        System.out.println(radiobuttonPresence5);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[7]/td/label")).getText().contains("Industry consultants");
		boolean radiobuttonPresence6=driver.findElement(By.id("490ID")).isDisplayed();
        System.out.println(radiobuttonPresence6);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[8]/td/label")).getText().contains("Newsletters/literature");
		boolean radiobuttonPresence7=driver.findElement(By.id("491ID")).isDisplayed();
        System.out.println(radiobuttonPresence7);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[9]/td/label")).getText().contains("Media (newspaper, radio, TV)");
		boolean radiobuttonPresence8=driver.findElement(By.id("492ID")).isDisplayed();
        System.out.println(radiobuttonPresence8);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[10]/td/label")).getText().contains("Associate/friend");
		boolean radiobuttonPresence9=driver.findElement(By.id("493ID")).isDisplayed();
        System.out.println(radiobuttonPresence9);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[11]/td/label")).getText().contains("Followed Link from another web page");
		boolean radiobuttonPresence10=driver.findElement(By.id("494ID")).isDisplayed();
        System.out.println(radiobuttonPresence10);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[12]/td/label")).getText().contains("Search engine");
		boolean radiobuttonPresence11=driver.findElement(By.id("495ID")).isDisplayed();
        System.out.println(radiobuttonPresence11);
        
        driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[13]/td/label")).getText().contains("Other (Please Specify)");
		boolean radiobuttonPresence12=driver.findElement(By.id("497ID")).isDisplayed();
        System.out.println(radiobuttonPresence12);
        
        //Asserts to verify the selection of radio buttons
        driver.findElement(By.id("484ID")).click(); //Select 'Literature: list source here' radio button
        //now we will check if 'Literature: list source here' radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("484ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected");
            }
        driver.findElement(By.id("497ID")).click(); //Select 'Other (Please Specify)' radio button
        //now we will check if 'Other (Please Specify)' radio button is selected or not? if selected then text besides that radio button will print
        if(driver.findElement(By.id("497ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[13]/td/label")).getText()+" "+"radio is selected");
        }
        else
        	System.out.println("Other radio not selected");
        //We verify if the radio button 'Other (Please Specify)' is unselected
        if(driver.findElement(By.id("484ID")).isSelected()){
            System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[1]/section[4]/div/form/table/tbody/tr[24]/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td/label")).getText()+" "+"radio is selected" );
            }
        else
        	System.out.println("once i have selected the second radio button, first radio button gets unselected");
        //We verify if the text box accepts input when radio button 'Other (Please Specify)' is selected
        driver.findElement(By.name("t_497")).sendKeys("Friends"); 
	}
	@Test(priority=11)
	public void twelfth(){
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Verify that the text box is present
		boolean textboxPresence = driver.findElement(By.id("qWidthCtrl_474")).isDisplayed();
		System.out.println(textboxPresence);
		//Verify that the text box accepts input
		driver.findElement(By.id("qWidthCtrl_474")).sendKeys("Nothing much to add.Everything is present.");
		System.out.println("Text box is accepting input");
		//Verify that the text box is present
		boolean textboxPresence1 = driver.findElement(By.id("qWidthCtrl_142636")).isDisplayed();
		System.out.println(textboxPresence1);
		//Verify that the text box accepts input
		driver.findElement(By.id("qWidthCtrl_142636")).sendKeys("vivek.rks29@gmail.com");
		System.out.println("Email id is entered in the textbox'Email'");
	}
}
	



