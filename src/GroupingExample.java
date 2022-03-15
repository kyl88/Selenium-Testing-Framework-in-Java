import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"component"})

    void test1(){

        System.out.println("This is test 1");

    }

    @Test(groups = {"regression"})
    void test2(){

        System.out.println("This is test 2");


    }

    @Test(groups = {"component"})
    void test3(){

        System.out.println("This is test3");


    }

    @Test(groups = {"regression"})
    void test4(){

        System.out.println("This is test4");

    }

    @Test(groups = {"regression","component"})
    void test5(){

        System.out.println("This is test5");
    }
}
