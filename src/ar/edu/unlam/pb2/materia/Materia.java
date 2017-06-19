package ar.edu.unlam.pb2.materia;

public class Materia {
	
		private String nombreMateria;
		private Materia miMateria;
		private Examen examen1;
		private Examen examen2;
		
		public Materia (String nombreMateria, Integer nota, Integer numeroParcial )
		{
			this.miMateria = new  Materia("defecto", 1, 1);
		}

		
		//getters y setters
		public String getNombreMateria() {
			return nombreMateria;
		}

		public void setNombreMateria(String nombreMateria) {
			this.nombreMateria = nombreMateria;
		}

		public Materia getMiMateria() {
			return miMateria;
		}

		public void setMiMateria(Materia miMateria) {
			this.miMateria = miMateria;
		}
		
		//metodos
		
		public void evaluar(Integer numeroParcial, Integer nota) throws Exception
		{
			if (numeroParcial==1)
			{
				examen1.calificarNota(nota);
			}
			else {
				throw new Exception ("No pertenece");
			}
			
			if (numeroParcial==2)
			{
				examen2.calificarNota(nota);
			}
			else {
				throw new Exception ("No pertenece");
			}
		}
	}
		
		

