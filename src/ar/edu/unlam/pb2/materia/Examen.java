package ar.edu.unlam.pb2.materia;

public class Examen {
	
	private Integer nota;
	private Integer numeroParcial;
	
	
	//constructor
	public Examen (Integer nota, Integer numeroParcial)
	{
		this.nota = nota;
		this.numeroParcial =numeroParcial;
	}

	
	// getters y setters
	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Integer getNumeroParcial() {
		return numeroParcial;
	}

	public void setNumeroParcial(Integer numeroParcial) {
		this.numeroParcial = numeroParcial;
	}


	//metodos
	public Integer calificarNota(Integer nota) throws Exception
	{
		if (nota>=1 && nota<=10)
		{
			return nota;
		}
		else
		{
			throw new Exception ("No se admite");
		}
	}
	
}
