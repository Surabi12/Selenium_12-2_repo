package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG //TestNG class
{
   @Test
   public void sample() { //test case
	   //test steps
	   Reporter.log("sample to TestNG",true);	   
   }
   
   @Test
   public void demo() {
	   Reporter.log("demo test case executed",true);
	   
   }
}
