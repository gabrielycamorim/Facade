package facade.Filme;



public class FilmeFormato {

	private Filme mkv;
	   private Filme mov;
	   private Filme wmv;

	   public FilmeFormato() {
	      mkv = new Mkv();
	      wmv = new Wmv();
	      mov = new Mov();
	   }

	   public void tipoMkv(){
	      mkv.tipo();
	   }
	   public void tipoMov(){
	      mov.tipo();
	   }
	   public void tipoWmv(){
	      wmv.tipo();
	   }
	}