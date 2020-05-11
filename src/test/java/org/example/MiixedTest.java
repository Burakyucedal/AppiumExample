package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.LongPressOptions;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.net.MalformedURLException;

public class MiixedTest extends BaseClassIOS{


    @Test
    public void setUp() throws MalformedURLException {
        IOSDriver<IOSElement> driver = capabilities();

        driver.get("https://www.facebook.com");
        driver.findElementById("m_login_email").sendKeys("hello");
        driver.findElementById("m_login_password").sendKeys("Burak");
        TouchAction t = new TouchAction(driver);
        driver.findElementByXPath("//*[@value='Log In']").click();

    }


}
