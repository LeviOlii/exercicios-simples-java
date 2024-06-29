package aula69.java;

public class MinhaThread extends Thread{

	public String nome;
	public int contador = 0;
	public int tempo;

	public MinhaThread(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
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
