package practice_2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Person (){

    }

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString (){
        return lastName + " " + firstName + " " + middleName;
    }

}
