public class SyncTest implements Runnable {

	@Override
	public   void run() {

		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		SyncTest st1=new SyncTest();
		Thread t1=new Thread(st1);
		t1.start();
		
		//SyncTest st2=new SyncTest();
		Thread t2=new Thread(st1);
		t2.start();
		/*
		SyncTest st3=new SyncTest();
		Thread t3=new Thread(st3);
		t3.start();
		
		SyncTest st4=new SyncTest();
		Thread t4=new Thread(st4);
		t4.start();*/
		

	}

}