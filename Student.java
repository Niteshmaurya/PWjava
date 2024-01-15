public class Student {
    int rollNo;
    String Name;
    int age;
    public static void main(String[] args) {
        Student nitesh = new Student();
        Student samsan = new Student();
        nitesh.age = 21;
        samsan.Name = "sam";
        System.out.println("age of the nitesh is "+nitesh.age);
        System.out.println("Name of the samsan is "+samsan.Name);

        
    }
}
