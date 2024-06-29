package aula72.java;

public class ThreadTiqueTaque implements Runnable{

	TiqueTaque tt;
	Thread t;

	final int NUM = 5;

	void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public ThreadTiqueTaque(String nome, TiqueTaque tt) {
		this.tt = tt;
		t = new Thread(this, nome);
		t.start();
	}

	@Override
	public void run() {

		if(t.getName().equalsIgnoreCase("Tique")) {
			for(int i = 0; i<NUM; i++) {
				sleep(1000);
				tt.tique(true);
			}
		}
		tt.tique(false);

		if(t.getName().equalsIgnoreCase("Taque")){
			for(int i = 0; i<NUM; i++) {
				sleep(1000);
				tt.taque(true);
			}
			tt.taque(false);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
