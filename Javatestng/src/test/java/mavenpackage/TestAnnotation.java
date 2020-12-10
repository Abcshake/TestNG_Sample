package mavenpackage;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class TestAnnotation {

    @Test
    public void testMethod1(){
        System.out.println("\nRunning test => testSum");
        Test2 obj= new Test2();
        int result = obj.sumNumbers(1, 2);
        Assert.assertEquals(result, 3);
    }
    @Test
    public void testMethod2(){
        System.out.println("\nRunning test => testStrings");
        String expectedString = "Hello World";
        Test2 obj = new Test2();
        String result = obj.addString("Hello", "World");
        Assert.assertEquals(result, expectedString);
    }

    @Test
    public void testMethod3(){
        System.out.println("\nEnd test => testArrays");
        int[] expectedArray = {1,2,3};
        Test2 obj = new Test2();
        int[] result = obj.getArray();
        Assert.assertEquals(result, expectedArray);

    }

    @Test
    public void testSum2(){
        SoftAssert sa = new SoftAssert();
        System.out.println("\nRunning Test -> TestSum2");
        Test2 obj = new Test2();
        int result = obj.sumNumbers(1, 2);
        int result2 = obj.sumNumbers(2, 2);
        sa.assertEquals(result, 3);
        System.out.println("\nRunning Test -> TestSum2");
        sa.assertEquals(result2, 4);
        sa.assertAll();
    }

    
}
