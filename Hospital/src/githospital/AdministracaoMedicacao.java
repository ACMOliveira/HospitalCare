package githospital;

import java.util.Date;

public class AdministracaoMedicacao {
	
		private PreparacaoMedicacao preparacao;
	    private Enfermeiro enfermeiro;
	     
	    private Date data_hora;
	 
	    public AdministracaoMedicacao(PreparacaoMedicacao preparacao, Enfermeiro enfermeiro, Date data_hora) {
	        this.preparacao = preparacao;
	        this.enfermeiro = enfermeiro;
	        this.data_hora = data_hora;
	    }

		public PreparacaoMedicacao getPreparacao() {
			return preparacao;
		}

		public void setPreparacao(PreparacaoMedicacao preparacao) {
			this.preparacao = preparacao;
		}

		public Enfermeiro getEnfermeiro() {
			return enfermeiro;
		}

		public void setEnfermeiro(Enfermeiro enfermeiro) {
			this.enfermeiro = enfermeiro;
		}

		public Date getData_hora() {
			return data_hora;
		}

		public void setData_hora(Date data_hora) {
			this.data_hora = data_hora;
		}
	    
}