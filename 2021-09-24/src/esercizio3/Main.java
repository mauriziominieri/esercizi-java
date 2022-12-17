package esercizio3;

/**
 * @author Maurizio Minieri
 * mauminieri@gmail.com
 * www.mauriziominieri.it 
 **/

/*
 * I thread possono cercare di accedere allo stesso oggetto, il synchronized permette che uno alla volta acceda.
 */

/*
 * Incremento x3 Fatto 1 2 3: Se il main è sempre più veloce degli altri: 
 * Il main si blocca al count. 
 * T incrementa count (1), sblocca count, si blocca ad x. 
 * Il main stampa Incremento e si blocca al count.
 * T incrementa count (2), lo sblocca e si blocca ad x.
 * Il main stampa Incremento e si blocca al count.
 * T incrementa count (3), lo sblocca e si blocca ad x.
 * Il main stampa incremento esce dal while e stampa Fatto, infine sblocca x.
 * 
 * "Incremento" sarà per forza prima di "Fatto" che sarà per forza prima degli indici.
 * 
 * 
 * Output possibili: 
 *    Incremento -> da 0 a 3 volte
 * 	  Fatto
 *    1 2 3 -> in qualsiasi ordine
 *
 */

public class Main {

	/*public static void main(String[] args) throws InterruptedException {
		final Object x = new Object();
		final int[] count = new int[1];
		
		class MyThread extends Thread {
			int id;
			MyThread(int n) { id = n; }
			public void run() {
				synchronized (x) {
					count[0]++;
					synchronized (count) {
						count.notify();
					}
					try {
						x.wait();
					} catch (Exception e) {}
				}
				System.out.println(id);
			}
		}
		
		Thread t1 = new MyThread(1), t2 = new MyThread(2), t3 = new MyThread(3);
		t1.start(); 
		t2.start(); 
		t3.start();
		synchronized (count) {
			while(count[0] < 3) {
				count.wait();
				System.out.println("Incremento");
			}
		}
		System.out.println("Fatto");
		synchronized (x) {
			x.notifyAll();
		}
	}*/
	
	
   /*
	* 1) Se il main è il più veloce allora count[0] parte da -1, t stampano 0 1 2, Fatto può stare ovunque dopo lo 0
	* 2) Se il main è il più lento: 1 2 3 e resta bloccato nel wait
	* 3) Puo succedere che stampo 1 2 poi il main mette a -1 e si blocca, t incrementa a 0 e sveglia il main.
	* 	 Quindi possiamo avere Fatto 0 oppure 0 Fatto. 
	* 4) stampo 1, il main mette a -1 e si blocca, stampo 0 1, Fatto può stare dopo lo 0 oppure dopo l'1
	* 
	* 
	* OUTPUT:
	* 0 1 2 Fatto
	* 0 Fatto 1 2
	* 0 1 Fatto 2
	* 1 2 3 Main bloccato
	* 1 0 1 Fatto
	* 1 0 Fatto 1
	* 
	* 
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//main + veloce, count[0] = -1, attende. t1 -> count[0] = 0 e sveglia il main, stampa 0. t2 -> count[0] = 1, stampa 1, Fatto t3 -> count[0] = 2, stampa 2 
	//main + lento, t1 incrementa, 1, t2 incrementa, 2, t3 incrementa, 3, main mette count[0] a -1, il main attende
	//main veloce, t2 incrementa a 1 sblocca il main, stampa 1, Fatto, 2, 3
	
	/*
		0 1 Fatto 2
		0 1 2 Fatto
		1 2 3 main bloccato
		//1 Fatto 2 3 ?
		1 
	*/
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
        final Object x = new Object();
        final int[] count = new int[1]; // Don't do this : use AtomicInteger
        class MyThread extends Thread {

            public void run() {
                synchronized (x) {
                    count[0]++;  //t2
                    x.notify();
                    System.out.println(count[0]);
                }
            }
        }
        Thread t1 = new MyThread(), t2 = new MyThread(), t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
        synchronized (x) {	//main
            count[0] = -1;
            while (count[0] < 0) {
                x.wait();
            }
        }
        t2.join();
        System.out.println("Fatto");
    }
}
