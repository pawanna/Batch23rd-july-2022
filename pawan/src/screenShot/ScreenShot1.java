package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1
{
    public void takeScreenShot(WebDriver driver,String filename) throws IOException
    {
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File destination =new File("E:\\0911_selinium\\Screenshot\\myscreenshot2"+filename+".jpg");
    	FileHandler.copy(src, destination);
    }
}
