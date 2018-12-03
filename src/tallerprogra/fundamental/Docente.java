package tallerprogra.fundamental;

import java.util.Date;

public class Docente {

	private static final int MESES_DE_AGUINALDO_2 = 2;

	private static final int MESES_DEL_AÑO_12 = 12;
	
	private int id;
	private String firstName;
	private String lastName;
	private Date birthDay;
	private Double salary;
	
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
		System.out.printf("El Salario Total %f \n", totalSalary);
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
