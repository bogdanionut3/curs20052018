package Listatelefoane;//trebuie sa cautam un numar de telefon anume dintr-o carte de telefoane

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();//am creat un obiect de tip phonebook
        Person[] persons = new Person[20];//am stabilit marimea listei
        phonebook.addPersons(persons);//aducem persoane in cartea de telefon

        Person person1 = new Person();//am creat un obiect
        person1.setName("bogdan"); //apelam o metoda setName pe obiectul person
        person1.setPhoneNumber("07777777");//apelam o metoda setPhonenumber pe obiectul person

        Person person2 = new Person();
        person2.setName("Dan");
        person2.setPhoneNumber("07777767");

        Person person3 = new Person();
        person3.setName("ionut");
        person3.setPhoneNumber("07777747");
//populam lista cu persoane
        persons[1] = person1;
        persons[2] = person2;
        persons[3] = person3;

        findPhoneNumber("ionut", phonebook);
        findPhoneNumber("IONUT", phonebook);
    }

    public static void findPhoneNumber(String name, Phonebook phonebook) {//cautam un numar de telefon
        for (int i = 0; i < 20; i++) {
            Person person = phonebook.getPersons()[i];//variabila pentru a crea lista

            if (person!=null&&person.getName().equals(name))//NULL sunt pozitiile goale din vector nefolosite
                System.out.println(person.getPhoneNumber());
        }
    }
}
