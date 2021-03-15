package selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    @Test
    public void test1(){
        System.out.println("code bf assetion");
        Assert.assertEquals(2,2);
        System.out.println("code after assertion");

    }
    @Test
    public void test2(){
            System.out.println("code bf soft assertion");
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(2,5);
        softAssert.assertEquals("john","john");
            System.out.println("code after soft assertion");
            softAssert.assertAll();

    }
}
