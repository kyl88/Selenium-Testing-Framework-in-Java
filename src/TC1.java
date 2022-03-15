import org.testng.annotations.*;


public class TC1 {

    @BeforeClass
    void BeforeClass(){

        System.out.println("This will execute before the main class");

    }

    @BeforeMethod

    void beforeMethod(){

        System.out.println("This will execute before the method");
    }
    @AfterMethod
    void afterMethod(){

        System.out.println("This will execute after the method");



    }

    @Test
    void test1(){

        System.out.println("This is test 1....");


    }


    @Test
    void test2(){

        System.out.println("This is test 2....");

    }

    @BeforeTest
    void BeforeTest(){

        System.out.println("Execute code before a test");



    }

    @AfterTest
    void AfterTest(){

        System.out.println("Execute code after a test ");
    }
}
