import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {


    @Test(priority = 1)
    void setup(){

        System.out.println("This is the Setup test");


    }

    @Test(priority = 2)
    void SearchCustomer(){

        System.out.println("This  is a search customer test");
Assert.assertEquals(1,1); // errors


    }

    @Test(priority = 3)
    void AddCustomer(){

        System.out.println("This is add customer test");



    }


    @Test(priority = 4)

    void teardown(){

        System.out.println("This is the closing browser");


    }


}
