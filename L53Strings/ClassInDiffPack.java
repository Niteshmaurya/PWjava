import L54OOps.Student;

public class ClassInDiffPack {

    public static void main(String[] args) {
        Student st = new Student();
        st.name = "niteshInOtherFile";
        System.out.println(st.name);     
    }
}