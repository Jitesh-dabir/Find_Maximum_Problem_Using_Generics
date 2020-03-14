public class FindMaximumProblem {

    //METHOD THAT RETURN MAXIMUM INTEGER BETWEEN THREE INTEGER NUMBER
    public Integer getMaximumOfIntegers(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maxResult = firstNumber;
        if (secondNumber.compareTo(maxResult) > 0) {
            maxResult = secondNumber;
        }
        if (thirdNumber.compareTo(maxResult) > 0) {
            maxResult = thirdNumber;
        }
        return maxResult;
    }

    //METHOD THAT RETURN MAXIMUM FLOAT BETWEEN THREE FLOAT NUMBER
    public Float getMaximumOfFloats(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maxResult = firstNumber;
        if (secondNumber.compareTo(maxResult) > 0) {
            maxResult = secondNumber;
        }
        if (thirdNumber.compareTo(maxResult) > 0) {
            maxResult = thirdNumber;
        }
        return maxResult;
    }

    //METHOD THAT RETURN MAXIMUM STRING BETWEEN THREE STRINGS
    public String getMaximumOfString(String firstString, String secondString, String thirdString) {
        String maxResult = firstString;
        if (secondString.compareTo(maxResult) > 0) {
            maxResult = secondString;
        }
        if (thirdString.compareTo(maxResult) > 0) {
            maxResult = thirdString;
        }
        return maxResult;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to find maximum problem");
    }
}