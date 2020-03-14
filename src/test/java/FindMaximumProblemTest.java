import org.junit.Assert;
import org.junit.Test;

public class FindMaximumProblemTest {
    //CREATED OBJECT OF MAIN CLASS
    FindMaximumProblem findMaximum = new FindMaximumProblem();

    @Test
    public void givenThreeIntegers_WhenMaximumFirstNumber_ShouldReturnTheMaximum() {
        Integer maximumOfIntegers = findMaximum.getMaximumOfIntegers(10, 9, 8);
        Assert.assertEquals((Integer) 10,maximumOfIntegers);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumSecondNumber_ShouldReturnTheMaximum() {
        Integer maximumOfIntegers = findMaximum.getMaximumOfIntegers(10, 20, 8);
        Assert.assertEquals((Integer) 20,maximumOfIntegers);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumThirdNumber_ShouldReturnTheMaximum() {
        Integer maximumOfIntegers = findMaximum.getMaximumOfIntegers(10, 20, 30);
        Assert.assertEquals((Integer) 30,maximumOfIntegers);
    }

    @Test
    public void givenThreeFloats_WhenMaximumFirstNumber_ShouldReturnTheMaximum() {
        Float maximumOfFloats = findMaximum.getMaximumOfFloats(10.2f, 2.5f, 3.6f);
        Assert.assertEquals((Float) 10.2f,maximumOfFloats);
    }

    @Test
    public void givenThreeFloats_WhenMaximumSecondNumber_ShouldReturnTheMaximum() {
        Float maximumOfFloats = findMaximum.getMaximumOfFloats(10.2f, 20.5f, 3.6f);
        Assert.assertEquals((Float) 20.5f,maximumOfFloats);
    }
}

