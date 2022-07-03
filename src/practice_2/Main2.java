package practice_2;

import java.util.LinkedList;

public class Main2 {

    public static void main(String[] args) {
        Person person1 = new Person("Усонов", "Усон", "Асанович");
        Person person2 = new Person("Асанов", "Усон", "Асанович");
        Person person3 = new Person("Асанов", "Усон", "Усонович");

        try {
            if (person1.getLastName().equals(person2.getLastName()) &&
                person1.getFirstName().equals(person2.getFirstName()) &&
                person1.getMiddleName().equals(person2.getMiddleName()) ||

                person3.getLastName().equals(person2.getLastName()) &&
                person3.getFirstName().equals(person2.getFirstName()) &&
                person3.getMiddleName().equals(person2.getMiddleName()) ||

                person1.getLastName().equals(person3.getLastName()) &&
                person1.getFirstName().equals(person3.getFirstName()) &&
                person1.getMiddleName().equals(person3.getMiddleName()))
                throw new DuplicateException();

            LinkedList<Person> personsList = new LinkedList<Person>();
            personsList.add(person1);
            personsList.add(person2);
            personsList.add(person3);

            for (Person p : personsList) {
                System.out.println(p.toString());
            }

        } catch (DuplicateException e)
        {
            System.out.println("Exception: " + e.toString());
        }

    }

}
