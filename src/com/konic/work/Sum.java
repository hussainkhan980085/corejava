package com.konic.work;

public class Sum {
	
  public static void main(String[] args) {
	
	  int [] a= new int[4];
	  
	  a[0]=10;
	  a[1]=20;
	  a[2]=30;
	  a[3]=40;
	  
	  
	  int sum = 0;
	  
	  for(int i =0;i< a.length;i++) {
		  sum =sum+a[i];
		  
	  }
	  System.out.println("sum:"+  sum);
	  
	  
}

}
