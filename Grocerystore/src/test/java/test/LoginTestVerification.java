package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pageobject.Loginpage;
import utilities.Base;

public class LoginTestVerification extends Base {
	
  @Test(dataProvider="dp")
  public void f(String u, String p) throws InterruptedException {
	  Loginpage ob=new Loginpage(driver);
		 ob.login(u,p);
		 
		 SoftAssert s=new SoftAssert();
		 s.assertAll();
		 
		s.assertEquals(u,g);
		  
  }
  
@DataProvider  
  
  public Object[][] dp() throws BiffException, IOException {
	  FileInputStream f=new FileInputStream("C:\\Users\\Meera Shaji\\Documents\\Selenium\\Example_dataprovider.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  Sheet s=w.getSheet("Sheet1");
	  int r=s.getRows();
	  int c=s.getColumns();
	  String input [][]=new String[r][c];
	  for(int i=0;i<r;i++)
	  {
		  for(int j=0;j<c;j++)
		  {
			  Cell cc=s.getCell(j, i);
			  input[i][j]=cc.getContents();
		  }
	  }
	 return input; 
}
}
