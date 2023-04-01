package StepDefinitions;

import Utilites.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void before() {

        System.out.println("Scenario starting");
    }

    @After // her scenariodan sonra isleyir
    public void after(Scenario scenario) {

        System.out.println("Scenario finished");

        GWD.quitDriver();
    }
}
