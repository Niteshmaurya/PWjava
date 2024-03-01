public class Scope {
    public static class StudentClass{ 
        String name;
        int rollNo;
        double per;

    }
    static void fun(String x){
        System.out.println(x);
    }

    static void fun2(StudentClass sx){
        System.out.println("name under class");
        System.out.println(sx.name);
        sx.name = "nitesh 2";
    }
    static void funINT(int x){

    }

    public static void main(String[] args) {
        fun("INDIA");
        StudentClass s1 = new StudentClass();
        s1.name = "nitesh";
        s1.rollNo = 23;
        s1.per = 82.2;

        System.out.println(s1.name);
        s1.name = "maurya";
        fun2(s1);
        System.out.println(s1.name);
    }
}
