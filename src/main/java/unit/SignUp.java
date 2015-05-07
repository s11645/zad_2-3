package unit;

import javax.servlet.http.HttpServletRequest;

public class SignUp {
	
	private String username;
	private String password;
	private String confirm;
	private String email;
	private boolean premiumCheck;
	private boolean adminCheck;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isPremiumCheck() {
		return premiumCheck;
	}
	public void setPremiumCheck(boolean premiumCheck) {
		this.premiumCheck = premiumCheck;
	}
	public boolean isAdminCheck() {
		return adminCheck;
	}
	public void setAdminCheck(boolean adminCheck) {
		this.adminCheck = adminCheck;
	}
	public SignUp(HttpServletRequest request) {
		super();
		this.username = request.getParameter("username");
		this.password = request.getParameter("password");
		this.confirm = request.getParameter("confirm");
		this.email = request.getParameter("email");
		this.premiumCheck = false;
		this.adminCheck = false;
	}
	
	
	public SignUp() {
		super();
		this.username = "rare";
		this.password = "rare123";
		this.confirm = "rare123";
		this.email = "rare@rare.pl";
		this.premiumCheck = true;
		this.adminCheck = true;
	}

}
