package base;

import driver.DriverManager;

public class BaseDriver {

    public void getDriver(){

        DriverManager manager = new DriverManager();
        manager.startDriver();
    }

}
