public class StringBulder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(" world");     //  + is not allowed here
        str.setCharAt(0,'m'); 
        System.out.println(str);  // mello world
        str.insert(2, 'y');
        System.out.println(str);  // meyllo world
        str.delete(2, 3);  // mello world
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);  // melo world

        // reverse method
        str.reverse();
        System.out.println(str);
    }
}
