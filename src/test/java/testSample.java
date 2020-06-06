import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;

public class testSample {

	public static void main(String[] args) throws IOException {
		
		dataDriven d = new dataDriven();
		ArrayList data = d.getData("add profile");
	//	System.out.println(" REACHED " );
		System.out.println("-----"+data.get(0));
		System.out.println("-----"+data.get(1));
		System.out.println("-----"+data.get(2));
		System.out.println("-----"+data.get(3));
		//driver.findElement(By.xpath("demo").sendKeys(data.get(0));
	}

}
