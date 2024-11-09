package com.cydeo.step_definitions;


/*
In this class we will be able to create "pre" and "post" condition
for all the scenario and even steps.
 */

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before (order = 1) // import before coming from cucumber
    public void setupMethod(){
        System.out.println("----> @Before: Running Before Each Scenario  ");
    }

   // @Before(value = "@login", order = 2) // import before coming from cucumber
    public void login_scenario_before(){
        System.out.println("----> @Before: Running Before Each Scenario  ");
    }
    @After
    public void teardownMethod(Scenario scenario){

        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }

        System.out.println("--->@After: Running After Each Scenario");
        BrowserUtils.sleep(4);
        Driver.closeDriver();

    }
    @BeforeStep
    public void setupStep(){
        System.out.println("--> @BeforeStep: Running Before Each Step ");
    }
    @AfterStep
    public void tearDownStep(){
        System.out.println("--> @AfterStep: Running After Each Step ");

    }



}
