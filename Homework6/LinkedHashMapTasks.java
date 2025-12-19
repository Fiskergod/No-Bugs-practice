package homework_6;

import java.util.LinkedHashMap;

public class LinkedHashMapTasks {
    static void main(String[] args) {
        //Task 1:
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Anna", "9162341232");
        phoneBook.put("Oleg", "9162346578");
        phoneBook.put("Max", "9162345498");
        phoneBook.put("Andrey", "9162343421");
        phoneBook.put("Petya", "9162341212");
        phoneBook.forEach(
                (name, phone) -> {
                    System.out.println("Name - " + name + ", phone - " + phone);
                }
        );
        //Task 2:
        addContact(phoneBook,"Evgenii", "9163452244");
        System.out.println(phoneBook);

        findContact(phoneBook,"Evgenii");
    }

    public static void addContact(LinkedHashMap<String, String> phoneBook, String name, String phone) {
        if (name.isBlank() || phone.isBlank()) {
            System.out.println("Name and phone can not be empty!");
        } else {
            phoneBook.put(name, phone);
        }
    }

    public static void findContact(LinkedHashMap<String, String> phoneBook, String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println(name + "'s phone number is " + phoneBook.get(name));
        } else {
            System.out.println("There is no such person!");
        }
    }
}
