class student{
    int rollNo;
    String studentName;
}

public class main {
    public static void main(String[] args) {
        
        student obj1 = new student();
        obj1.rollNo = 23;
        obj1.studentName = "Nitesh Maurya";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

        student obj2 = new student();
         obj2.rollNo = 24;
        obj2.studentName = "Vikas C";
        System.out.println(obj2.studentName);
        System.out.println(obj2.rollNo);

    }
}
