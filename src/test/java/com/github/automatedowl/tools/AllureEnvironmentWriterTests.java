package com.github.automatedowl.tools;

import com.google.common.collect.ImmutableMap;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

/** Class that contains TestNG unit tests for creating environment.xml file for allure-results. */
public class AllureEnvironmentWriterTests {

    @BeforeSuite
    void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "70.0.3538.77")
                        .put("URL", "http://testjs.site88.net")
                        .build(), System.getProperty("user.dir")
                        + "/allure-results/");
    }

    @Test
    void sanityOneTest() {
        Assert.assertTrue(true);
    }

    @Test
    void sanityTwoTest() {
        Assert.assertTrue(true);
    }
}
