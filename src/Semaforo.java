
public enum Semaforo {
	
	VERMELHO(20),
	VERDE(20),
	AMARELO(5);
	
	private final int duracao;

	private Semaforo(int duracao) {
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}
	
}
