package multithreadingconcepts.com;

 class TwoWaysToCreatThreads implements Runnable{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
		System.out.println("Child thread");	
		}
	}
}
  class ThreadDemo {
	 public static void main(String[] args){
	 TwoWaysToCreatThreads r=new TwoWaysToCreatThreads();
	 
	 Thread t=new Thread(r);
	 t.start();
	 for(int i=0; i<10; i++)
	 {
		 System.out.println("Parent thread");
	 }
	 }
}
