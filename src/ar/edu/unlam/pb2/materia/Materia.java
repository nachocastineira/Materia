package ar.edu.unlam.pb2.materia;

public class Materia {
	
		private String nombreMateria;
		private Examen examen1;
		private Examen examen2;
		
		public Materia (String nombreMateria,  Integer numeroParcial)
		{
			this.examen1 = new Examen( null);
			this.examen2 = new Examen(null);
		}

		
		//getters y setters
		public String getNombreMateria() {
			return nombreMateria;
		}

		public void setNombreMateria(String nombreMateria) {
			this.nombreMateria = nombreMateria;
		}
	
		public Examen getExamen1() {
			return examen1;
		}

		public void setExamen1(Examen examen1) {
			this.examen1 = examen1;
		}

		public Examen getExamen2() {
			return examen2;
		}

		public void setExamen2(Examen examen2) {
			this.examen2 = examen2;
		}


		//metodos para evaluar		
//		public void evaluar(Integer numeroParcial, Integer nota) throws Exception
//		{
//			if (numeroParcial==1)
//			{
//				examen1.calificarNota(nota);
//			}
//			else {
//				throw new Exception ("No pertenece");
//			}
//			
//			if (numeroParcial==2)
//			{
//				examen2.calificarNota(nota);
//			}
//			else {
//				throw new Exception ("No pertenece");
//			}
//		}
//	}
		
		public void evaluar(Integer numeroParcial, Integer nota) 
		{
			if (examen1.getNumeroParcial()==1)
			{
				examen1.calificarNota(nota);
			}
			
			else {
				System.out.println("ERROR: La nota asignada no pertenece al examen 1");				
			       }
			
			if (examen2.getNumeroParcial()==2)
			{
				examen2.calificarNota(nota);
			}
			else {
				System.out.println("ERROR: La nota asignada no pertenece al examen 2");
			}
		}
	}
		
		

