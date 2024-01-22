package testing.example;

import courses.calculator.Calculator;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MyFirstTestNGTest {

    Calculator c;
    int count;

    @BeforeClass
    public void setUp() {
        c = new Calculator();
        System.out.println("Set Up run before class");
    }

    @BeforeMethod
    public void setUpBeforeMethod(){
        System.out.println
        count=0;
    }
    @Test(description = "This is first test from class", enabled = false)
    public void test1(){
        System.out.println("Run test1");
    }

    public void test2() {
        System.out.println("Run test2");
    }

    protected void help() {
        System.out.println("This is a help method");
    }

    @DataProvider
    public Object [][] calculatorDataProvider() {
        return new Object[][] {
//                expectedResults,a,b,op,delta
                {5,2,3, "+", 0},
                {10,-2, -5, "*", 0},
                {1.4142, 2, 0, "SQRT", 0.0001}
        };
    }
    @Test(dataProvider = "calculatorDataProvider")
    public void verifyCalculatorTest(double expectedResults, double a, double b, String op, double delta){
        System.out.println("Compute calculator asser with delta: "+ delta + " for: "+a+""+op + "" + b + "=" + expectedResults);
        Assert.assertEquals(expectedResults, c.compute(a, b, op), delta);
    }

    @DataProvider
    public Object [][] exceptionCalculatorDataProvider() {
            return new Object[][]{
                    {2,3,"test"},
                    {4,0, "/"}

            };
    }

}
