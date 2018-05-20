package Listatelefoane;

public class Phonebook {

    private Person[] persons = new Person[20];

    public void addPersons(Person[] persons) {//metoda care foloseste clasa persoane
        this.persons = persons;
    }

    public Person[] getPersons() {//
        return this.persons;
    }
}
