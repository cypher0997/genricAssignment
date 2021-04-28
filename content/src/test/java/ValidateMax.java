

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidateMax {
    CheckMax checkMax;

    @Before
    public void setUp() throws Exception {
        checkMax = new CheckMax();
    }

    /**
     * @method  test if the max value present at 1st position, it pass or not
     * @test for integer
     */
    @Test
    public void integerMaxAtFirstPositionTest() {
        int valueToCheck = checkMax.findMaximum(55,33,4);
        Assert.assertEquals(55, valueToCheck);
    }

    /**
     * @method  test if the max value present at 2nd position, it pass or not
     * @test for integer
     */
    @Test
    public void integerMaxAtSecondPositionTest() {
        int valueToCheck = checkMax.findMaximum(22,33,4);
        Assert.assertEquals(33, valueToCheck);
    }

    /**
     * @method  test if the max value present at 3rd position, it pass or not
     * @test for integer
     */
    @Test
    public void integerMaxAtThirdPositionTest() {
        int valueToCheck = checkMax.findMaximum(2,33,49);
        Assert.assertEquals(49, valueToCheck);
    }

    /**
     * @method  test if the max value present at 1st position, it pass or not
     * @test for float
     */
    @Test
    public void floatMaxAtFirstPositionTest() {
        float valueToCheck = checkMax.findMaximum(7.6f,4.9f,4.0f);
        Assert.assertEquals(7.6f, valueToCheck, 0.0);
    }

    /**
     * @method  test if the max value present at 2nd position, it pass or not
     * @test for float
     */
    @Test
    public void floatMaxAtSecondPositionTest() {
        float valueToCheck = checkMax.findMaximum(5.6f,8.9f,3.5f);
        Assert.assertEquals(8.9f, valueToCheck,Math.abs(8.9f - 8.9f));
    }

    /**
     * @method  test if the max value present at 3rd position, it pass or not
     * @test for float value
     */
    @Test
    public void floatMaxAtThirdPositionTest() {
        float valueToCheck = checkMax.findMaximum(5.9f,3.1f,9.0f);
        Assert.assertEquals(9.0f, valueToCheck, 0.0);
    }


    /**
     * @method  test if the max value present at 1st position, it pass or not
     * @test for string
     */
    @Test
    public void stringMaxAtFirstPositionTest() {
        String valueToCheck = checkMax.findMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", valueToCheck);
    }


    /**
     * @method test if the max value present at 2nd position, it pass or not
     * @test for string
     */
    @Test
    public void stringMaxAtSecondPositionTest() {
        String valueToCheck = checkMax.findMaximum("Apple", "Peach", "Bannana");
        Assert.assertEquals("Peach" , valueToCheck);
    }

    /**
     * @method test if the max value present at 3rd position,it pass or not
     * @test for string
     */
    @Test
    public void stringMaxAtThirdPositionTest() {
        String valueToCheck = checkMax.findMaximum("Apple", "Bannana", "Peach");
        Assert.assertEquals("Peach", valueToCheck);
    }

    @Test
    public void stringMaxTestWithMultipleValues() {
        String valueToCheck = checkMax.findMaximum("Apple", "Bannana", "Peach", "mango","ziooj");
        Assert.assertEquals("ziooj", valueToCheck);
    }

    @Test
    public void floatMaxTestWithMultipleValues() {
        float valueToCheck = checkMax.findMaximum(9.6f,7.3f,2.3f,4.5f);
        Assert.assertEquals(9.6f, valueToCheck,0.0);
    }

    @Test
    public void integerMaxTestWithMultipleValues() {
        int valueToCheck = checkMax.findMaximum(10,13,88,90);
        Assert.assertEquals(90, valueToCheck);
    }



}
