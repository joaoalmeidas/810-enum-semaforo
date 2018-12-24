
public class SemaforoTeste {

	public static void main(String[] args) {
		
		System.out.println("Semaforo\nCor e a sua duração respectiva.\n");
		
		System.out.printf("Cor -> Duração\n");
		
		for(Semaforo semaforo : Semaforo.values()) {
			
			System.out.println(semaforo.toString()+" -> "+semaforo.getDuracao());
			
		}

	}

}
