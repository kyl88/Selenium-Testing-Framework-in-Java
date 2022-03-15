import org.testng.annotations.Test;


public class SecondTestCase {

    @Test
    void setup(){

        System.out.println("The is a setup test");
    }

    @Test
    void login(){

        System.out.println("This is an login test");


    }

    @Test
    void teardown(){

        System.out.println("Close the browser ");

    }

}
