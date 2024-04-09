package Dpackage;

public class getters_setters {
	String name;
	String ID;
	int Age;
	Float Salary;

	
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public Float getSalary() {
		return Salary;
	}

	public void setSalary(Float salary) {
		Salary = salary;
	}
	
	void show ()
	{
		System.out.println(name);
		System.out.println(ID);
		System.out.println(Age);
		System.out.println(Salary);
	}

	@Override
	public String toString() {
		return "getters_setters [name=" + name + ", ID=" + ID + ", Age=" + Age + ", Salary=" + Salary + "]";
	}

}
