package ServPackage;

public class RegisterBeanClass {

	
	
	
	
	String id; 
	String password;
	String username;
	String email;
	int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() 
	{
		return "RegisterBeanClass [id=" + id + ", password=" + password + ", username=" + username + ", email=" + email
				+ ", age=" + age + "]";
	}
	
		
	}
	
	


