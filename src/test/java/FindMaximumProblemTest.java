import org.junit.Assert;
import org.junit.Test;

public class FindMaximumProblemTest {

    @Test
    public void givenThreeIntegersInParamerter_WhenMaximumFirstNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10,9,8);
        Integer maximumOfIntegers = (Integer) findMaximum.getMaximum();
        Assert.assertEquals((Integer) 10,maximumOfIntegers);
    }

    @Test
    public void givenThreeIntegersInParamerter_WhenMaximumSecondNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10,20,8);
        Integer maximumOfIntegers = (Integer) findMaximum.getMaximum();
        Assert.assertEquals((Integer) 20,maximumOfIntegers);
    }

    @Test
    public void givenThreeIntegersInParamerter_WhenMaximumThirdNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10,20,30);
        Integer maximumOfIntegers = (Integer) findMaximum.getMaximum();
        Assert.assertEquals((Integer) 30,maximumOfIntegers);
    }

    @Test
    public void givenThreeFloatsInParamerter_WhenMaximumFirstNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10.2f,2.5f,3.6f);
        Float maximumOfFloats = (Float) findMaximum.getMaximum();
        Assert.assertEquals((Float) 10.2f,maximumOfFloats);
    }

    @Test
    public void givenThreeFloatsInParamerter_WhenMaximumSecondNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10.2f,20.5f,3.6f);
        Float maximumOfFloats = (Float) findMaximum.getMaximum();
        Assert.assertEquals((Float) 20.5f,maximumOfFloats);
    }

    @Test
    public void givenThreeFloatsInParamerter_WhenMaximumThirdNumber_ShouldReturnTheMaximum() {
        FindMaximumProblem findMaximum = new FindMaximumProblem(10.2f,20.5f,30.6f);
        Float maximumOfFloats = (Float) findMaximum.getMaximum();
        Assert.assertEquals((Float) 30.6f,maximumOfFloats);
    }

    @Test
    public void givenThreeStringsInParamerter_WhenMaximumFirstString_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("jitesh", "dipesh", "akshay");
        String maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "jitesh",maximumOfString);
    }

    @Test
    public void givenThreeStringsInParamerter_WhenMaximumSecondString_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("dipesh", "jitesh", "akshay");
        String maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "jitesh",maximumOfString);
    }

    @Test
    public void givenThreeCapitalStringsInParamerter_WhenMaximumFirstString_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("JITESH", "DIPESH", "AKSHAY");
        String maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "JITESH",maximumOfString);
    }

    @Test
    public void givenThreeNumberStringsInParamerter_WhenGetMaximum_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("1", "2", "3");
        String maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "3",maximumOfString);
    }

    @Test
    public void givenThreeStringsAsCombinationInParamerter_WhenGetMaximum_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("1", "JITESH", "jitesh");
        String maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "jitesh",maximumOfString);
    }

    @Test
    public void givenThreeStringsCombinationInParamerter_WhenGetMaximum_ShouldReturnTheMaximumString() {
        FindMaximumProblem findMaximum = new FindMaximumProblem("1", "Jitesh", "3");
        String maximumOfString = (String) findMaximum.getMaximum();
        Assert.assertEquals((String) "Jitesh",maximumOfString);
    }
}

