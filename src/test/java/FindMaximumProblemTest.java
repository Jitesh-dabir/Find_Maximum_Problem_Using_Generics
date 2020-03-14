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
}
}
