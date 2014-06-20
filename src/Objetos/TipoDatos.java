package Objetos;

public class TipoDatos {
//declaro las caracteristicas del objeto
	private String titulo;
	private String subTitulo;
	
//delcaro el constructor del mismo nombre qu ela clase
	
	public TipoDatos(String _titulo,String _subtitulo){
		this.titulo=_titulo;
		this.subTitulo=_subtitulo;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubTitulo() {
		return subTitulo;
	}

	public void setSubTitulo(String subTitulo) {
		this.subTitulo = subTitulo;
	}
	

}
