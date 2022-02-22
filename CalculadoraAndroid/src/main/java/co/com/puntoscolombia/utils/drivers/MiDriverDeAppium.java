package co.com.puntoscolombia.utils.drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MiDriverDeAppium {

    private static AppiumDriver<MobileElement> driver;

    public static MiDriverDeAppium suNavegador() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability("appPackage", "me.lam.calculatorvault");
        capabilities.setCapability("appActivity", "me.lam.calculatorvault.activity.CalculatorActivity");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("platformVersion", "11");

        try {
            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return new MiDriverDeAppium();
    }

    public AppiumDriver<MobileElement> mobile() {
        return driver;
    }

}
