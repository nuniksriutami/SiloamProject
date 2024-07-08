package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features = {"src/main/resources/featrues/01Login.feature",
//        "src/main/resources/featrues/06NewSearchNama.feature",
//        "src/main/resources/featrues/03New.feature",
//        "src/main/resources/featrues/08NewSearchKota.feature",
//        "src/main/resources/featrues/07NewSearchNomor.feature",
//        "src/main/resources/featrues/09NewSearchAsal.feature",
//        "src/main/resources/featrues/10NewSearchTujuan.feature"},
//
@CucumberOptions(features = {"src/main/resources/featrues/01LoginInvalid.feature"},
                    plugin = {"pretty","html:target/cucumber-report.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
