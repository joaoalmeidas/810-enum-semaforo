
public class SemaforoTeste {

	public static void main(String[] args) {
		
		System.out.println("Semaforo\nCor e a sua dura��o respectiva.\n");
		
		System.out.printf("Cor -> Dura��o\n");
		
		for(Semaforo semaforo : Semaforo.values()) {
			
			System.out.println(semaforo.toString()+" -> "+semaforo.getDuracao());
			
		}

	}

}
