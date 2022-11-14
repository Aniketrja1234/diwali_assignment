import java.util.*;
class Array4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(" enter size of array");
       int n=s.nextInt();
       int a[]=new int[n];
       System.out.println(" enter array elements");
       for(int i=0;i<a.length;i++){
       a[i]=s.nextInt();
       }
        System.out.println(" reverse array elements");
         for(int i=a.length-1;i>=0;i--){
        System.out.print(a[i]+" ");
    }
}
}