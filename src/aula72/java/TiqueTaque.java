package aula72.java;

public class TiqueTaque {

	public boolean tique;

	public synchronized void tique(boolean estaExecutando) {

		if(!estaExecutando) {
			tique = true;
			notify();
			return;
		}

		System.out.print("Tique ");

		tique = true;

		notify();

		while(tique) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}

	public synchronized void taque(boolean estaExecutando) {

		if(!estaExecutando) {
			tique = false;
			notify();
			return;
		}

		System.out.print("Taque\n");

		tique = false;

		notify();

		while(!tique) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
