package persons;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Item A");
        list.add("Item B");
        
        System.out.println("List: " + list);

        
        list.remove("Item B");
        
        System.out.println("List after removal: " + list);
    }
}

