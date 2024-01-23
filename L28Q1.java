import java.util.ArrayList;
import java.util.Collections;

public class L28Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1); 
        l.add(2); 
        l.add(3); 
        l.add(4); 
        l.add(5); 
        System.out.println("initially " +l);

        // reverseArrayList(l);
        Collections.reverse(l); 
        System.out.println("finally"+l);

        Collections.sort(l);
        System.out.println("Ascending "+l);
        Collections.sort(l,Collections.reverseOrder());  
        System.out.println("Descending "+l);

        ArrayList<String> l1= new ArrayList<>();
        l1.add("Hello" ); 
        l1.add("Mr" ); 
        l1.add("Nitya"); 
        l1.add("Ji"); 
        System.out.println("og"+l1);
        Collections.sort(l1);
        System.out.println("Ascending"+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Descending "+l1);
    }
    static void reverseArrayList(ArrayList<Integer> l){
        int i =0,j = l.size()-1;
        while (i<j) {
            /*
             int temp = a;    
             a =b;
             b = temp;
             */
            Integer temp  = Integer.valueOf(l.get(i));
            l.set(i,l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
    }
}
