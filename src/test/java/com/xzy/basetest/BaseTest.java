package com.xzy.basetest;

import com.xzy.propertyreader.PropertyReader;
import com.xzy.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility
{
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp()
    {
        selectBrowser(browser);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown()
    {
        closeBrowser();
    }
}
