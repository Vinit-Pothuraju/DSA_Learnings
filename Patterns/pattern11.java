package Patterns;
public class pattern11 {
    public static void main(String[] args) {
        int n=5;
        int flag=1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                flag=1;
            }else{
                flag=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(flag+" ");
                flag=1-flag;
            }
            System.out.println();
        }
    }
}

