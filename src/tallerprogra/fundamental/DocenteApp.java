package tallerprogra.fundamental;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DocenteApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Docente> docentes = new ArrayList<Docente>();
		Docente obj = null;
		
		obj = new Docente(1,"Jose","Perez",new Date(),1000.05);
		docentes.add(obj);

		
		obj = new Docente(2,"Jose2","Perez2",new Date(),5000.10);
		docentes.add(obj);
		
		obj = new Docente(3,"Ana","Perez",new Date(),1300.15);
		docentes.add(obj);

 
		for(Docente o:docentes){
			System.out.printf("ID: %d, Nombre %s, Apellido %s , Fecha %s \n",
					o.getId(),o.getFirstName(),o.getLastName());
			
			o.evaluarFechaPar();
			o.calculateAnualSalary();
			if(o.getTotalSalary() > 20000){
				System.out.println("Tiene bono!");
			}
			
		}
	}

}
