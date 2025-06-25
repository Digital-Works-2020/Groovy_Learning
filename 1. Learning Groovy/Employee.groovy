import groovy.transform.*

@Canonical
class Employee implements Serializable{
    String firstName
    String lastName
    int age
    def getFullName(){
        return firstName + " " + lastName
    }
}
