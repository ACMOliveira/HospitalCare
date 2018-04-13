package githospital;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
		 
	//Reresenta o papel do frmEntrada
		
	 private static void precondicoes() {
	        //Precondições
	        Doente doente= new Doente(1,"Maria");
	        RegistoObjetos.inserirDoente(1, doente);
	        FuncionarioAdministrativo fadmin = new FuncionarioAdministrativo(1, "Ana");
	        RegistoObjetos.inserirFuncAdmin(1, fadmin);
	    }
	 
	 private static void inserirEntrada() {
		        //O código do diagrama de sequência "Inserir Entrada"
		 int codigoDoente = 1;
		 Doente d = RegistoObjetos.devolverDoente(codigoDoente);
		 System.out.println(d.getNome());
		 
		 int codigoFunc = 1;
		 FuncionarioAdministrativo f = RegistoObjetos.devolverFuncAdmin(codigoFunc);
		 System.out.println(f.getNome());
		         
		 Entrada e = new Entrada(1,f,d, LocalDateTime.parse("2015-02-20T06:30:00"));
		 Entrada e1 = new Entrada(2,f,d, LocalDateTime.now());
		 RegistoObjetos.inserirEntrada(1, e);
	}
		 
		   
		    public static void main(String[] args) {
		        precondicoes();
		        inserirEntrada();
		    }
		
	}
