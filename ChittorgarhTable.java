package week5.Day1;

	import java.time.Duration;
	import java.util.LinkedHashSet;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
    import org.openqa.selenium.edge.EdgeDriver;

	public class ChittorgarhTable 
	{

		public static void main(String[] args) {
			
			EdgeDriver driver=new EdgeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.get("https://www.chittorgarh.com/");
			  driver.findElement(By.id("navbtn_stockmarket")).click();
			  driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
			  List<WebElement> SecurityName= driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr/td[3]"));
	          System.out.println("Security Count is" +SecurityName.size());
	          for (int i = 0; i < SecurityName.size(); i++) {
	        	  System.out.println(SecurityName.get(i).getText());
				
			}
	          Set<WebElement>dup= new LinkedHashSet<WebElement>(SecurityName);
	          System.out.println("Set Size is" +dup.size());
	          
	          if(SecurityName.size()==dup.size()) {
	        	  System.out.println("There is no duplicate Security Names");
	          }
	          else
	        	  System.out.println("There are duplicates");
		}

	}


