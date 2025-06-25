class Collections{
    static void main(String[] args){
        Employee e1 = new Employee(firstName: "Pavan", lastName : "Kumar", age: 40)
        Employee e2 = new Employee(firstName: "Arun", lastName : "Prakash", age: 15)
        Employee e3 = new Employee(firstName: "Pavan", lastName : "Kalyan", age: 20)

        //Creating a List
        def allEmployees = [e1, e2, e3]
        assert allEmployees instanceof List
        assert allEmployees.size() == 3
        assert allEmployees[2] == e3

        //Iterate over Collection. No Parameter for Closure ==> It refers to instance being called
        allEmployees.each{
            println it.getFullName()
        }
        
        //Iterate over collections & use an index
        allEmployees.eachWithIndex{ Employee e, int i ->
            println i + ": " + e
        }

        //Filtering Elements matching certain condition
        allEmployees.findAll { it.firstName == "Pavan" }.each {
            println "Found Employee: " + it.getFullName()
        }

        //Transforming Elements
        println allEmployees.collect { it.age>= 18 }

        //Sorting Elements
        println allEmployees.sort { it.age }
    }
}
