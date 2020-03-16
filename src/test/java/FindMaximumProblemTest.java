import org.junit.Assert;
import org.junit.Test;

public class FindMaximumProblemTest {

    //VARIABLES
    Integer maximumOfIntegers;
    Float maximumOfFloats;
    String maximumOfString;

    @Test
    public void givenThreeIntegersInParameterConstructor_WhenMaximumFirstNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10,9,8);
        maximumOfIntegers = (Integer) findMaximum.getMaximum();
        Assert.assertEquals((Integer) 10,maximumOfIntegers);
    }

    @Test
    public void givenThreeIntegersInParameterConstructor_WhenMaximumSecondNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10,20,8);
        maximumOfIntegers = (Integer) findMaximum.getMaximum();
        Assert.assertEquals((Integer) 20,maximumOfIntegers);
    }

    @Test
    public void givenThreeIntegersInParameterConstructor_WhenMaximumThirdNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10,20,30);
        maximumOfIntegers = (Integer) findMaximum.getMaximum();
        Assert.assertEquals((Integer) 30,maximumOfIntegers);
    }

    @Test
    public void givenThreeFloatsInParameterConstructor_WhenMaximumFirstNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10.2f,2.5f,3.6f);
        maximumOfFloats = (Float) findMaximum.getMaximum();
        Assert.assertEquals((Float) 10.2f,maximumOfFloats);
    }

    @Test
    public void givenThreeFloatsInParameterConstructor_WhenMaximumSecondNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10.2f,20.5f,3.6f);
        maximumOfFloats = (Float) findMaximum.getMaximum();
        Assert.assertEquals((Float) 20.5f,maximumOfFloats);
    }

    @Test
    public void givenThreeFloatsInParameterConstructor_WhenMaximumThirdNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10.2f,20.5f,30.6f);
        maximumOfFloats = (Float) findMaximum.getMaximum();
        Assert.assertEquals((Float) 30.6f,maximumOfFloats);
    }

    @Test
    public void givenThreeStringsInParameterConstructor_WhenMaximumFirstString_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("jitesh", "dipesh", "akshay");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "jitesh",maximumOfString);
    }

    @Test
    public void givenThreeStringsInParameterConstructor_WhenMaximumSecondString_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("dipesh", "jitesh", "akshay");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "jitesh",maximumOfString);
    }

    @Test
    public void givenThreeCapitalStringsInParameterConstructor_WhenMaximumFirstString_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("JITESHD", "DIPESH", "AKSHAY");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "JITESHD",maximumOfString);
    }

    @Test
    public void givenThreeNumberStringsInParameterConstructor_WhenGetMaximum_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("1", "2", "3");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "3",maximumOfString);
    }

    @Test
    public void givenThreeStringsAsCombinationInParameterConstructor_WhenGetMaximum_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("1", "JITESH", "jitesh");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "jitesh",maximumOfString);
    }

    @Test
    public void givenThreeStringsCombinationInParameterConstructor_WhenGetMaximum_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("1", "Jitesh", "3");
        maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "Jitesh",maximumOfString);
    }
}

