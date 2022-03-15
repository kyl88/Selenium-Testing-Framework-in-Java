import org.testng.annotations.*;

public class TC2 {

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
    void test3(){

        System.out.println("This is test case 3");

    }

    @Test
    void test4(){

        System.out.println("This is test case 4");
    }

    @BeforeTest
    void BeforeTest(){

        System.out.println("Execute code before a test");

    }

    @AfterTest
    void AfterTest(){

        System.out.println("Execute code after a test");

    }

    @BeforeSuite
    void BeforeSuite(){

        System.out.println("Execute code before the test suite");
    }

    @AfterSuite
    void AfterSuite(){

        System.out.println("Execute code after the test suite");


    }



}
