package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class PhoneBookMap {

    Map<String, String> phoneBook;

    PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    public void addRecord(String name, String phone) {
        phoneBook.put(phone, name);
    }

    public ArrayList<String> getPhone(String name) {
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, String> entry : phoneBook.entrySet())
            if (name.equals(entry.getValue()))
                list.add(entry.getKey());
        return list;                                                    
    }
}

public class PhoneBook {

    public static void main(String[] args) {
        PhoneBookMap phoneBookExample = new PhoneBookMap();
        phoneBookExample.addRecord ("Lennon", "+44 23 333 00 00 01");
        phoneBookExample.addRecord ("McCartney", "+44 23 333 00 00 02");
        phoneBookExample.addRecord ("McCartney", "+44 23 333 00 00 03");
        phoneBookExample.addRecord ("Harrison", "+44 23 333 00 00 04");
        phoneBookExample.addRecord ("Harrison", "+44 23 333 00 00 05");
        phoneBookExample.addRecord ("Harrison", "+44 23 333 00 00 06");
        phoneBookExample.addRecord ("Starr", "+44 23 333 00 00 07");

        String name = "Lennon";
        System.out.println(name + ": " + phoneBookExample.getPhone(name));
        name = "McCartney";
        System.out.println(name + ": " + phoneBookExample.getPhone(name));
        name = "Harrison";
        System.out.println(name + ": " + phoneBookExample.getPhone(name));
        name = "Starr";
        System.out.println(name + ": " + phoneBookExample.getPhone(name));
    }
}
