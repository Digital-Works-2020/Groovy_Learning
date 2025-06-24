import groovy.transform.*

//@ToString
//@EqualsAndHashCode
//@TupleConstructor
//All 3 Combined as Canonical
@Canonical
class Person{
    String firstName
    String lastName
    int age
    String getFullName(){
        firstName + " " + lastName
    }
}
