package Chapter5.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite is running~");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite is running~");
    }

}
