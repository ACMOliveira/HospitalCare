package githospital;

public class Doente {

	private int codigo;
	private String nome;

	public Doente(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

		public String getNome() {
		return nome;
	}
}
