package view;
import java.util.concurrent.Semaphore;

import controller.ThreadTransito;
public class main {

	public static void main(String[] args) {
		
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for(int idCarro = 1; idCarro <= 4; idCarro++) {
			Thread carro = new ThreadTransito(idCarro, semaforo);
			carro.start();
		}

	}

}
