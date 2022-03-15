package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class ListenerTest {

    @Test
    void test1(){

        System.out.println("This is Test 1");

        Assert.assertEquals("A","A");


    }




    @Test
    void test3(){

        System.out.println("This is test 3");

        throw new SkipException("This is the skip execution");





    }
}
