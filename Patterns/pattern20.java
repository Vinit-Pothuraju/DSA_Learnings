package Patterns;

public class pattern20 {
    public static void main(String[] args) {
        int n=5;
        int iniS=2*n-2;
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"); 
            }     
            iniS -= 2;
            System.out.println();
        }
        iniS=2;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<iniS;j++){ 
                System.out.print(" ");
            }
            for(int j=1;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();

            iniS += 2;
        }
    }
}
