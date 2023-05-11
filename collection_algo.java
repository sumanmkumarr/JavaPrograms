import java.util.*;

public class collection_algo {
    public static void main(String args[]) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(20);
        l1.add(-20);
        l1.add(40);
        l1.add(-40);
        l1.add(10);
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(l1, r);
        System.out.println("reverse order");
        for (int i : l1) {
            System.out.println(i);
        }
        Collections.shuffle(l1);
        System.out.println("list shuffle");
        for (int x : l1) {
            System.out.println(x);
        }
        System.out.println("minimum element" + Collections.min(l1));
        System.out.println("minimum element" + Collections.max(l1));
    }
}
