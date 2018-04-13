package githospital;

import java.time.LocalDateTime;
import java.util.Date;

public class Entrada {

	private int codigo;
	private FuncionarioAdministrativo funcionario;
	private Doente doente;
	private LocalDateTime data_hora;

	public Entrada(int codigo, FuncionarioAdministrativo funcionario, Doente doente, LocalDateTime localDateTime) {
		super();
		this.codigo = codigo;
		this.funcionario = funcionario;
		this.doente = doente;
		this.data_hora = localDateTime;
	}
	
}
