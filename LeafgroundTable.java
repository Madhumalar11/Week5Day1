package week5.Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LeafgroundTable {

	public static void main(String[] args) {
		
		 EdgeDriver driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://leafground.com/table.xhtml");
          List<WebElement> RowCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr"));
          System.out.println("Row count is " + RowCount.size());
          
          List<WebElement> ColumnCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]//th"));
          System.out.println("Column count is " + ColumnCount.size());
          for (int i = 0; i <ColumnCount.size(); i++) {
        	  System.out.println(ColumnCount.get(i).getText());
			
		}
          String Name = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[4]/td[1]")).getText();
          System.out.println("Name of the customer-" +Name);
          String JoinDate = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[4]/td[4]")).getText();
          System.out.println("Joining Date-" + JoinDate);
	}

}