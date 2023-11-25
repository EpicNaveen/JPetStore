package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.GenerateReportClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\NAVEEN\\eclipse-workspace\\ProjectCucumberOct2023\\src\\test\\resources\\Feature\\Loginpage.feature", 
glue = "org.step",
plugin = {
		"html:target\\HtmlReport",
		"junit:target\\xmlReport.xml",
		"json:target\\JsonReport.json" })

public class TestRunnerClass {

	@AfterClass
	public static void tc01() {
		
		GenerateReportClass.toGenerate("target\\JsonReport.json");

	}
}
