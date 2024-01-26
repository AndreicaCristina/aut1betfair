package courses.calculator;

//import jdk.jfr.Category;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {
    static Calculator c;

    @BeforeClass
    public static void setUp() {
        System.out.println("Set up Testing variables");
        c = new Calculator();
    }

    @Before
    public void beforeMethod() {
        System.out.println("This method runs before each test");
    }

    @Test
    public void verifyAdditionComputeTest() {
        System.out.println("Verify addition works accordingly");
        Assert.assertEquals(5, c.compute(2, 3, "+"), 3);
//        Assert.assertEquals(5, c.compute(-2, 3, "+"), 3);
    }

    @Test
    public void myTestMethod2() {
        System.out.println("Hello world from Testing");
    }

    @Test
    @Ignore
    public void verifyUnsupportedOperation() {
        try {
            c.compute(2, 5.4, "+");
            System.out.println("Method do not return exception as expected");
            Assert.fail();
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        } catch (Exception e) {
            System.out.println("We are expected to received IllegalArgumentException");
            Assert.fail();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyUnsupportedOperation2() {
        c.compute(2, 5.4, "test");
    }

    @After
    public void afterMethod() {
        System.out.println("This method run after each test");
    }

    @AfterClass
    public static void cleanUp() {
        System.out.println("Clean up Testing variables");
        c = null;
    }

    @Test
    public void verifySubtractionComputeTest() {
        System.out.println("Verify the subtraction work accordingly");
    }

    @Test
    public void verifyDivisionComputeTest() {
        System.out.println("Verify the division work accordingly  ");
    }

    @Test
    public void verifyMultiplicationComputeTest() {
        System.out.println("Verify the multiplication work accordingly ");
    }
    @Test
    public void verifyDivisionByZero() {
       System.out.println("Verify the division by zero work accordingly ");
    }

    @Test
    public void testEquality(){
        String str1 = "Hello";
        String str2 = "Hello";
        Assert.assertEquals(str1, str2);
        System.out.println("The strings are equal");
    }

    @Test
    public void testNull() {
        Object obj1 = null;
        Assert.assertNull(null);
        System.out.println("The object is null");
    }

    @Test
    public void testList() {
        List<String> list = new ArrayList<>();
        list.add("Test1");
        list.add("Test2");
        Assert.assertEquals(2, list.size());
        Assert.assertTrue(list.contains("Test1"));
        System.out.println("The list contains 2 elements, and one of them includes the string Test1");
    }
}
