package com.vamsi.threading;

public class Lab2 {
	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();

		Thread t1= new Thread(t);
		Thread t2= new Thread(t);
		
		     t1.start();
		   t2.start();
	  Thread  th = Thread.currentThread();
	  for(int i=1;i<=10;i++) {
		System.out.println(th.getName()+"-value is:"+i);
		
	
	  try {
		  Thread.sleep(100);
	  }catch(Exception e) {
		  e.printStackTrace();
	  }

}
	}}
 class ThreadDemo implements Runnable{
	 
	 public void run() {
		 
		Thread th = Thread.currentThread();
		
		for(int i=1;i<=10;i++) {
			System.out.println(th.getName()+"-value is:");
		}
			
			try {
				
				Thread.sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
}
 }
