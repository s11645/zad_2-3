package unit;

import javax.servlet.http.HttpServletRequest;

public class Profile {
	
	private String username;
	private String adressType;
	private String province;
	private String city;
	private String postalCode;
	private String street;
	private String number;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAdressType() {
		return adressType;
	}
	public void setAdressType(String adressType) {
		this.adressType = adressType;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Profile(String username, HttpServletRequest request) {
		super();
		this.username = username;
		this.adressType = request.getParameter("typAdresu");
		this.province = request.getParameter("województwo");
		this.city = request.getParameter("miasto");
		this.postalCode = request.getParameter("kodPocztowy");
		this.street = request.getParameter("ulica");
		this.number = request.getParameter("dom");
	}
	
	

}
