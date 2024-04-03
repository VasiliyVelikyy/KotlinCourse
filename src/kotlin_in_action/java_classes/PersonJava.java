package kotlin_in_action.java_classes;

import kotlin_in_action.kotlin_classes.Person;

public class PersonJava {
    public static void main(String[] args) {
        Person person = new Person("IvanJava", 26);
        System.out.println(person.isMan());

    }
}
