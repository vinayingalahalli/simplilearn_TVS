package using_thread_class;

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		Thread t=Thread.currentThread();
		t.setName("vin-main");
		t.setPriority(6);
		
		System.out.println(Thread.currentThread());
		
		MyThread t1=new MyThread();
		t1.setName("myThread-1");
		MyThread t2=new MyThread();
		t2.setName("myThread-2");
		MyThread t3=new MyThread();
		t3.setName("myThread-3");
		MyThread t4=new MyThread();
		t4.setName("myThread-4");
		MyThread t5=new MyThread();
		t5.setName("myThread-5");
		t5.setPriority(9);
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t4.setDaemon(true);
		t5.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Printing from "+Thread.currentThread().getName()+" value of i = "+i);
//			try {
//				Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				System.out.println(e);
//			}
//		}
		System.out.println("Bye  bye main");

	}

}
