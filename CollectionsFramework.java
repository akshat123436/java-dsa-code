import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsFramework {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        System.out.println(arr);
        System.out.println(arr.size());
        arr.add("2");
        arr.add("2");
        // internally size is increase by n + n/2 + 1
        System.out.println(arr.size());

        ArrayList<String> second = new ArrayList<>();
        second.add("null");

        // to add a new list
        arr.addAll(second);
        System.out.println(arr.get(arr.size() - 1));

        // range based loop

        for (String s : arr)
            System.out.println(s);

        // iterator

        Iterator<String> it = arr.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
