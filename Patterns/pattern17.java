package Patterns;

public class pattern17 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int k=0;k<2*i+1;k++){
                System.out.print(ch);
                if(k<i){
                    ch++;
                }else{
                    ch--;   
                }
            }
            System.out.println();
        }
    }
}
