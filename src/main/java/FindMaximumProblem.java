public class FindMaximumProblem <T extends Comparable<T>> {

    //VARIABLES
    private T firstValue;
    private T secondValue;
    private T thirdValue;
    private T maximumValue;

    //DEFAULT CONSTRUCTOR
    FindMaximumProblem() {
    }

    //PARAMETER CONSTRUCTOR
    FindMaximumProblem(T firstValue, T secondValue, T thirdValue ) {
        this.firstValue=firstValue;
        this.secondValue=secondValue;
        this.thirdValue=thirdValue;
    }

    //GENERIC METHOD THAT RETURN MAXIMUM  BETWEEN THREE VALUES
    public  <T extends Comparable<T>>  T getMaximum(T firstValue, T secondValue, T thirdValue) {
        T maxResult = firstValue;
        if (secondValue.compareTo(maxResult) > 0) {
            maxResult = secondValue;
        }
        if (thirdValue.compareTo(maxResult) > 0) {
            maxResult = thirdValue;
        }
        return maxResult;
    }

    //METHOD THAT CALL INTERNAL METHOD
    public T getMaximum() {
        maximumValue = getMaximum(firstValue, secondValue, thirdValue);
        printMaximum(maximumValue);
        return maximumValue;
    }

    //METHOD THAT PRINT MAXIMUM VALUE
    public void printMaximum(T maxValue) {
        System.out.println("Maximum value:" +maxValue);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to find maximum problem");
    }

}
