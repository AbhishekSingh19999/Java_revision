package Dpackage;

public class EmpConstructor {
	
	String name;
	String ID;
	int Age;
	Float Salary;
	
	public EmpConstructor()
	{
		System.out.println("Defaut Constructor Called");
	}
	
	public EmpConstructor(String Name,String ID, int Age, Float Salary)
	{
		this.name=Name;
		this.Age=Age;
		this.Salary=Salary;
		this.ID=ID;
	}
	
	

	

	

	@Override
	public String toString() {
		return "EmpConstructor [Employee Name :" + name + ", Employee ID :" + ID + ", Emp Age:" + Age + ", Emp Salary:" + Salary + "]";
	}

	
           
	}


