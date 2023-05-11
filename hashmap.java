import java.util.*;

public class hashmap {
    public static void main(String args[]) {
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("anil", 86.1);
        hm.put("bhanu", 71.3);
        hm.put("chandu", 55.4);
        hm.put("pavan", 64.5);
        hm.put("dinesh", 91.2);
        System.out.println("hashmap" + hm);
        System.out.println("keys" + hm.keySet());
        System.out.println("values" + hm.values());
        System.out.println("entrySet" + hm.entrySet());

    }
}
