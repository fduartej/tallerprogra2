package tallerprogra.fundamental;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Docente {

	private static final int MESES_DE_AGUINALDO_2 = 2;

	private static final int MESES_DEL_AÑO_12 = 12;
	
	private int id;
	private String firstName;
	private String lastName;
	private Date birthDay;
	private Double salary;
	private Double totalSalary;
	
	public Docente(int id, String firstName,String lastName,
			Date birthDay,Double salary){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.salary = salary;
	}
	
	public void calculateAnualSalary(){
		double totalSalary = salary * (MESES_DEL_AÑO_12 + MESES_DE_AGUINALDO_2);
		DecimalFormat f = new DecimalFormat("###,###.00");  
		System.out.printf("El Salario es %s y el Total %s \n",
				f.format(salary), 
				f.format(totalSalary));
		this.totalSalary = totalSalary;
	}
	
	public void evaluarFechaPar(){
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String fecha = format.format(birthDay);
		int evaluar = Integer.parseInt(fecha);
		if(evaluar%2==0){
			System.out.printf("Fecha %s PAR!!!\n",fecha);
		}else{
			System.out.printf("Fecha %s IMPAR!!!\n",fecha);
		}

	}
	
	
	
	public Double getTotalSalary() {
		return totalSalary;
	}

	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	
}
