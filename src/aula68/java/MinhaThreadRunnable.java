package aula68.java;

public class MinhaThreadRunnable implements Runnable{
	
		public String nome;
		public int contador = 0;
		public int tempo;

		public MinhaThreadRunnable(String nome, int tempo) {
			this.nome = nome;
			this.tempo = tempo;
			Thread t1 = new Thread(this);
			t1.start();
		}

		@Override
		public void run() {
			while(contador!=10) {
				contador++;
				System.out.println(nome + " - " + contador);
				try {
					Thread.sleep(tempo);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
