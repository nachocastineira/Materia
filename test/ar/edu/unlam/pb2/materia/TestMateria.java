package ar.edu.unlam.pb2.materia;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMateria {

	@Test // tengo que poner eso, sino se cae el programa
	public void test() 
	{
		Materia miMateria1 = new Materia(null, null); 
		Examen miExamen1 = new Examen(1);  // creo el objeto examen 1 y le doy sus valores
		Examen miExamen2 = new Examen(2);  // creo el objeto examen 2 y le doy sus valores

		miMateria1.setExamen1(miExamen1);  //le seteo al objeto materia 1 los valores del examen1
		miMateria1.setExamen2(miExamen2);  //le seteo al objeto materia 2 los valores del examen1
					
		miMateria1.getExamen1().setNota(8);   //le asigno la nota al examen1
		miMateria1.getExamen1().setNumeroParcial(1); //le asigno el numero de parcial al examen 1
		
		miMateria1.getExamen2().setNota(7);   //le asigno la nota al examen1
		miMateria1.getExamen2().setNumeroParcial(2); //le asigno el numero de parcial al examen 1
		
		miMateria1.evaluar(miMateria1.getExamen1().getNumeroParcial(), miMateria1.getExamen1().getNota());  //hago el metodo evaluar con los valores seteados anteriormente
		miMateria1.evaluar(miMateria1.getExamen2().getNumeroParcial(), miMateria1.getExamen2().getNota());
		
		assertEquals(miMateria1.getExamen1().getNota(), 8, 0);
		assertEquals(miMateria1.getExamen2().getNota(), 7, 0);
		
		


		
	}

}
