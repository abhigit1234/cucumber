package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import Base.base;

public class read extends base{
	
	public read() {
		try {
			fis = new FileInputStream(".//src/test/resources/config.properties");
			p = new Properties();
			p.load(fis);
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
	}
	public String getBrowser() {
		String browser=p.getProperty("browser");
		if(browser!=null) {
			return browser;
		}else {
			throw new RuntimeException("invalid browser initialised");
		}
	}
	
	public String getUrl() {
		String url=p.getProperty("url");
		if(url!=null) {
			return url;
		}else {
			throw new RuntimeException("invalid url launched");
		}
	}

}
