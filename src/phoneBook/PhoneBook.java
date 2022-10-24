package phoneBook;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private static Map<String, String> phones = new HashMap<>();

    public static void add(String name, String phoneNumber){
        if (name == null || name.isEmpty()){
            throw new RuntimeException("Укажите имя");
        }
        if (phoneNumber == null || phoneNumber.isEmpty()){
            throw new RuntimeException("Укажите номер телефона");
        }
        phones.put(name, phoneNumber);
    }

    public static String findByName(String name){
        return phones.get(name);
    }

    public static Set<String> findByPhone(String phoneNumber){
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, String> entry: phones.entrySet()) {
            if (entry.getValue().equals(phoneNumber)){
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void print(){
        System.out.println("Справочник:");
        for (Map.Entry<String, String> entry: phones.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

