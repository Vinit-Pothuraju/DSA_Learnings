package Patterns;

public class pattern15 {
    public static void main(String[] args) {
        String str="ABCDE";
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(str.charAt(j)+" ");
            }
            
            System.out.println();
        }
    }
}
