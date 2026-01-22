package Recursion;

public class name_recursion {
    public static void main(String[] args) {
        fun("Vinit",5);
    }
    public static void fun(String name,int n){
        if(n==0){
            return;
        }
        System.out.println(name);
        fun(name,n-1);
    }
}
