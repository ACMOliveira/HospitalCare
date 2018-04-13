package githospital;

	import java.util.HashMap;
	 
	public class RegistoObjetos {
	   
		//para guardar os hashmaps com a lista de todos os objetos criados.
		
		private static HashMap<Integer,Doente> doentes = new HashMap<Integer,Doente>(); 
	    private static HashMap<Integer,FuncionarioAdministrativo> funcadmin = new HashMap<Integer,FuncionarioAdministrativo>();
	    private static HashMap<Integer,Entrada> entradas = new HashMap<Integer,Entrada>();
	     
	    public static void inserirDoente(Integer codigo, Doente doente) {
	        doentes.put(codigo, doente);
	    }
	    public static Doente devolverDoente(Integer codigo) {
	        return doentes.get(codigo);
	    }
	    public static void inserirFuncAdmin(Integer codigo, FuncionarioAdministrativo func) {
	        funcadmin.put(codigo, func);
	    }
	    public static FuncionarioAdministrativo devolverFuncAdmin(Integer codigo) {
	        return funcadmin.get(codigo);
	    } 
	    public static void inserirEntrada(Integer codigo, Entrada entrada) {
	        entradas.put(codigo, entrada);
	    }
	    public static Entrada devolverEntrada(Integer codigo) {
	        return entradas.get(codigo);
	    }  
	}

