package selenium.testng;

import org.testng.annotations.Test;

public class TestAnotation2 {

    @Test(expectedExceptions = RuntimeException.class) //supposed to throw an exeption and if not
    public void test6() {

        System.out.println("test6");
        throw new RuntimeException();
    }                               //dependency method override the alphabetical

    //order so test 6 will be run first and 7 second
    @Test(dependsOnMethods = "test6")
    public void test7() {

        System.out.println("test7");
    }
}


