class Main{
    static def main(String[] args) {
        Calculator c = new Calculator()
        println "Addition: ${c.add(10, 5)}"
        println "Subtraction: ${c.subtract(10, 5)}"
        println "Multiplication: ${c.multiply(10, 5)}"
        println "Division: ${c.divide(10, 3)}"
        try{
            println "Division: ${c.divide(10,0)}"
        }
        catch(ArithmeticException e){
            println "Arithmetic Exception occurred as we tried to divide by zero"
            assert e.getMessage() == "Division by zero is not allowed"
        }
        assert c.add(10, 5) == 15
    }
}
