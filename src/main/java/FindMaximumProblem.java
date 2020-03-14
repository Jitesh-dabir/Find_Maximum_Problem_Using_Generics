public class FindMaximumProblem {

    //METHOD THAT RETURN MAXIMUM  BETWEEN THREE VALUES
    public <T extends Comparable<T>> T getMaximum(T firstValue, T secondValue, T thirdValue) {
        T maxResult = firstValue;
        if (secondValue.compareTo(maxResult) > 0) {
            maxResult = secondValue;
        }
        if (thirdValue.compareTo(maxResult) > 0) {
            maxResult = thirdValue;
        }
        return maxResult;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to find maximum problem");
    }

}
