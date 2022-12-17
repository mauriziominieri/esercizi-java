package esercizio2;

/**
 * @author Maurizio Minieri
 * mauminieri@gmail.com
 * www.mauriziominieri.it 
 **/




public class Main {
	public static void main(String[] args) {
		final int[] a = new int[5];
		final int[] b = new int[5];
		
		{
			a[0] = 2;
			a[1] = 6;
			a[2] = 5;
			a[3] = 3;
			a[4] = 9;
			b[0] = 1;
			b[1] = 7;
			b[2] = 8;
			b[3] = 5;
			b[4] = 4;
		}
		
		class MyThread extends Thread{
			public void run() {
				
				//
					
					for(int i=0; i<a.length; i++) {
						
						try {
							a.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} //
						
						if(a[i] > b[i]) {
							int temp = b[i];
							b[i] = a[i];
							a[i] = temp;
						}
					
						for(int j=0; j<a.length; j++) 
							System.out.println(a[j]);
						
						}
					
					
				a.notifyAll();
			}
		}
		
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.start();
		t2.start();
	}

}
