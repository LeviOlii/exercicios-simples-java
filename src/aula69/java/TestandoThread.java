package aula69.java;

public class TestandoThread {

	public static void main(String[] args) {
		
		MinhaThread t1 = new MinhaThread("Thread #1", 1000);
		MinhaThread t2 = new MinhaThread("Thread #2", 900);
		MinhaThread t3 = new MinhaThread("Thread #3", 800);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Programa finalizado");

	}

}
