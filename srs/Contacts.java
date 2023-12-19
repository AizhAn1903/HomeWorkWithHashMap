import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contacts {
    public static void main(String[] args) {
        Map<String,Long> contacts = new HashMap<>();
        contacts.put("Ivan",123456789L);
        contacts.put("Petr",987654321L);
        contacts.put("Maria",1357892L);

        String number = String.valueOf(contacts.get("Ivan"));

        System.out.println("Phone number for Ivan:" + number);

        contacts.remove("Petr");

        System.out.println("Contacts:");
        for (String name : contacts.keySet()) {
            String phone = String.valueOf(contacts.get(name));
            System.out.println(name + " " + phone);
        }





        }
    }


