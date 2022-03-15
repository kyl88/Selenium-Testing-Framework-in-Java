package ParallelTesting;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class ParallelTest1 {



    @Test(dependsOnMethods ={"HomePageTitle"},groups ={"Static"},priority = 1)


    void WebsiteLogoTest()  {

    }

    @Test(groups = "regression test",priority = 2)
    void HomePageTitle() {

}

@AfterTest
void teardown(){



}



}
