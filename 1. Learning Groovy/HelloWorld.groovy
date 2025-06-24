class HelloWorld{
    static def main(String[] args) {
        println "Hello, World!"
        int age = 40
        println age
        // Get type of Age
        println age.getClass()

        def name = "John Doe"
        println name
        // Get type of Name
        println name.getClass()

        //Person - Class Objects
        Person person = new Person()
        person.setFirstName("John")
        person.setLastName("Doe")
        person.setAge(40)
        println person.getFullName()
        println person.getAge()

        //Conditional to identify a person is middle-aged or not
        if(person.getAge() >= 45 && person.getAge() <=65){
            println person.getFullName() + " is middle-aged"
        }
        else{
            println person.getFullName() + " is " + person.getAge() + " years old"
        }
        
        //Loop over Multiple objects
        def persons = [person, new Person(firstName: "Mary", lastName: "Hill", age: 45)]
        for(Person p : persons){
            println p.getFullName() + " is " + p.getAge() + " years old"
        }

        // person.getFullName().toLong()//Causes java.lang.NumberFormatException
        try{
            person.getFullName().toLong()
        }
        catch(NumberFormatException e){
            assert e instanceof NumberFormatException
            println "Cannot convert String into Long"
        }

        //Dropping last 2 characters from End
        Person p = new Person(firstName: "Johnny", lastName:"Hill", age : 60 )
        println p.getFirstName().dropRight(2)

        println p.toString()
        println p.hashCode()

        def p1 = new Person(firstName: 'Pavan', lastName : 'P', age: 30)
        def p2 = new Person(firstName: 'Pavan', lastName : "P", age: 30)
        println p1 == p2

        //Closure
        Closure personToString = { println p1.toString() }
        //Calling Closure
        personToString()

        //Closure with parameters
        Closure personToStringParam = { Person personobj -> println personobj.toString()}
        personToStringParam(p1)

        handlePerson(personToString, p1)

        Closure personFullName = { Person personobj2 -> println personobj2.getFullName()}
        handlePerson(personFullName, p2)
    }

    //Passing Closure as a parameter to method
    static void handlePerson(Closure c, Person p){
        if(p == null){
            throw new RuntimeException("Person parameter cannot be null")
        }
        c(p)
    }
}
