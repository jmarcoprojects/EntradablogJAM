


/**
 * Clase para manejar las entradas de un blog.
 * @author Juan Antonio Marco
 * @version 1.0
 * @since 30/01/2020
 */

public class EntradaBlogJAM{
	
	

	/**
	 * Atributos de la clase.
	 * separador es el ccarácter que separa ENTRADA DE del nombre del autor.
	 * Id de la entrada.
	 * texto de la entrada.
	 * autor de la entrada.
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;//
	
	/**
	 * Constructor de la clase
	 * @param id es el identificador de la entrada.
	 * @param autor es el nombre de la entrada.
	 * @param texto es el texto que contiene la entrada.
	 * @throws IllegalArgumentException excepción que se lanza si el id es negativo.
	 */
	public EntradaBlogJAM(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	
	/**
	 * @return id de la entrada.
	 * @version 1.0
	 */
	public int getId(){
		return this.id;
	}
	
	
	/**
	 * @return el texto completo de la entrada.
	 * @version 1.0
	 */
	public String getTexto(){
		return this.texto;
	}
	
	
	/**
	 * @return el nombre del autor de la entrada en mayúsculas.
	 * @version 1.0
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	//devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	/**
	 * @return nombre del autor. Ya no se usa. Ver getAutor.
	 * @deprecated
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	
	/**
	 * Metodo main. 
	 * @param args no tiene porqué tener argumentos.
	 */
	public static void main(String[] args) {
               
		EntradaBlogJAM e1=new EntradaBlogJAM (3,"Juan Antonio Marco ","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}