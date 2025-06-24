class Calculator{
    int add(int num1, int num2){
        num1 + num2
    }
    int subtract(int num1, int num2){
        num1 - num2
    }
    int multiply(int num1, int num2){
        num1 * num2
    }
    float divide(int num1, int num2){
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed")
        }
        num1 / num2
    }
}
