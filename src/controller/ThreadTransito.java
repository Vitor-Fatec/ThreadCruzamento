package controller;

import java.util.concurrent.Semaphore;

public class ThreadTransito extends Thread{
	
	private int idCarro;
	private Semaphore semaforo;
	private String sentido;
	
	public ThreadTransito(int idCarro, Semaphore semaforo) {
		this.idCarro = idCarro;
		this.semaforo = semaforo;
	}
	
	@Override
	public void run() {
		try {
			semaforo.acquire();
			transito();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
	}

	private void transito() {
		int tempo = (int) ( Math.random() * 3000) + 1000;
		
		if(idCarro == 1) {
			sentido = "direita";
			System.out.println("O carro 1 está atravessando para "+sentido+ " aguarde...");
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(idCarro == 2) {
			sentido = "esquerda";
			System.out.println("O carro 2 está atravessando para "+sentido+ " aguarde...");
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(idCarro == 3) {
			sentido = "cima";
			System.out.println("O carro 3 está atravessando para "+sentido+ " aguarde...");
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(idCarro == 4) {
			sentido = "baixo";
			System.out.println("O carro 4 está atravessando para "+sentido+ " aguarde...");
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
