public class TriangularPattern {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<=4;i++)
        {
            for(j=4-i;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
