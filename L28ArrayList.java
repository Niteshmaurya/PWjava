import java.util.ArrayList;

public class L28ArrayList {
    public static void main(String[] args) {
        // wrapper classes 
        Integer i = Integer.valueOf(3);
        System.out.println(i);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> b1 = new ArrayList<>();

        // add new element 
        l1.add(23);
        l1.add(234);
        l1.add(2345);
        l1.add(245);

        // get an element at index i
        int k = l1.get(2);
        // System.out.println(k);

        // print with for loop
        for(int j=0;j<l1.size();j++){
            // System.out.println(l1.get(j));
        }
        // printing the arrayList directly

        System.out.println(l1);

        // adding element at some index i 
        l1.add(1,100);
        System.out.println(l1);

        // modifying element at index i
        l1.set(1, 20);
        System.out.println(l1);    

        // removing an element with index
            l1.remove(3);
            System.out.println(l1);

        // removing an element by value 
            l1.remove(Integer.valueOf(245));    
            System.out.println(l1);

            // checking if element exist
            boolean j = l1.contains(Integer.valueOf(20)); 
            System.out.println(j);

            // if you dont specify class, you can put anything inside l 
            ArrayList l = new ArrayList();
            l.add("heyl");
            l.add(23);
            l.add(3.4f);
            l.add(true); 
            System.out.println(l);

            // indexof
            l1.add(1,786);
            System.out.println(l1);
            System.out.println(l1.indexOf(786));
            System.out.println(l1.lastIndexOf(786));
    }
}
