package Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Page.page;
import utilities.read;

public class base {
	
	public static long implicit = 10;
	public static long pageLoadTimeOut = 10;
	public WebDriver driver;
	public JavascriptExecutor jse;
	public static FileInputStream fis;
	public static Properties p;
	public static read rc;
	public static page pom;
		

	
}
