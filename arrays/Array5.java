class Array5{
    public static void main(String[] args) {
      int a[]={5,9,4,8,3,7};
      int min=a[0];
      int max=a[0];
      
      for(int i=0;i<a.length;i++){
          if(a[i]<min){
              min=a[i];
          }
          if(a[i]>max){
              max=a[i];
          }
      }
      System.out.println("smallest " +min +" largest " + max);
}
}