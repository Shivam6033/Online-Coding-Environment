package login.db;

public class Users 
{	
	private String email , password, mobile , city;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Users(String email, String password, String mobile, String city) {
		super();
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.city = city;
	}

	public Users() {
		super();
	}
	
}
