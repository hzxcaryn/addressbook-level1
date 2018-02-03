package seedu.addressbook;

import java.util.Comparator;

public class Person {
    private String name;
    private String phone;
    private String email;

    public Person(String inputName, String inputPhone, String inputEmail) {
        name = inputName;
        phone = inputPhone;
        email = inputEmail;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    /**
     * Comparator for sorting the list by Person Name in ascending order
     */
    public static Comparator<Person> NameComparator = new Comparator<Person>() {
        public int compare(Person s1, Person s2) {
            String name1 = s1.getName().toUpperCase();
            String name2 = s2.getName().toUpperCase();
            return name1.compareTo(name2);
        }};

}
