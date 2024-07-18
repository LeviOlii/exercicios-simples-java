package aula74.java;

public class ThreadSemaforo implements Runnable{

	private CorSemaforo cor;
	private boolean parar = false;
	private int quantCiclos;

	public ThreadSemaforo(int quantCiclos) {
		this.cor = CorSemaforo.VERMELHO;
		new Thread(this).start();
		this.quantCiclos = quantCiclos*3;
	}

	@Override
	public void run() {
		int count = 0;
		while(!parar) {
			try {
				switch(this.cor) {
				case VERMELHO:
					System.out.println("O semáforo está VERMELHO!");
					Thread.sleep(3000);
					break;
				case AMARELO:
					System.out.println("O semáforo está AMARELO!");
					Thread.sleep(1000);
					break;
				case VERDE:
					System.out.println("O semáforo está VERDE!");
					Thread.sleep(4000);
					break;
				default:
					break;
				}
				
				count++;
				if(count==this.quantCiclos) {
					parar = true;
					continue;
				}
				
				mudarCor();

			} catch (InterruptedException e) {
				e.printStackTrace();
			} 

		}
	}

	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemaforo.VERDE;
			break;
		case AMARELO:
			this.cor = CorSemaforo.VERMELHO;
			break;
		case VERDE:
			this.cor = CorSemaforo.AMARELO;
			break;
		default:
			break;
		}
	}

}
