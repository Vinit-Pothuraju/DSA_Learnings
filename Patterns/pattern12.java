package Patterns;
public class pattern12 {
    public static void main(String[] args) {
        int n=5;
        int space=2*(n-1);
        for(int i=1;i<n;i++){
            // stars
          
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<space;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            space-=2;
            System.out.println();
        }
    }
}
