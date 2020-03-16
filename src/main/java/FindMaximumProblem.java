public class FindMaximumProblem <T extends Comparable<T>> {

    //GENERIC METHOD THAT RETURN MAXIMUM  BETWEEN THREE VALUES
    public T getMaximum(T firstValue, T secondValue, T thirdValue) {
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
