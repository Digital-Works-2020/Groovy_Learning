class WriteFiles{
    static void main(String[] args)
    {
        File textFile = new File("mary.txt")
        //File Exists, withWriter overwrites
        textFile.withWriter('UTF-8') { BufferedWriter writer ->
            writer.writeLine("Line 1")
            writer.writeLine("Line 2")
            writer.writeLine("Line 3")
        }
        //Unlike writeLine, Append or Left Shift Operator does not add \n
        textFile.append("Line 4\n")
        textFile.append("Line 5\n")
        textFile << "Line 6\n"
        textFile << "Line 7"

        //Serializing Objects - For this Employee must implement Serializable
        Employee e = new Employee(firstName: "Pavan", lastName: "Kumar", age: 30)
        File binFile = new File("employee.bin")
        binFile.withObjectOutputStream { ObjectOutputStream out ->
            out.writeObject(e)
        }
    }
}
