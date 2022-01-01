package selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertion {

    @Test
    public void test1() {
        System.out.println("code bf assertion");
        Assert.assertEquals(1, 2);      //  hard assertion
        System.out.println("code after assertion");
    }

    @Test
    public void test2() {
        System.out.println("code bf soft assertion");
        SoftAssert softAssert = new SoftAssert();  //default constructor  doesn't pass any parameter
        softAssert.assertEquals(2, 2);
        softAssert.assertEquals("Ashely", "john");
        System.out.println("code after soft assertion");
        softAssert.assertAll();
    }
}
