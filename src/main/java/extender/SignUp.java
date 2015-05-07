package extender;

import java.util.ArrayList;

public class SignUp {
	
	public ArrayList<unit.SignUp> signUpArray = new ArrayList<unit.SignUp>();
	
	public void add(unit.SignUp signUp)
	{
		signUpArray.add(signUp);
	}
	
	public void newAdmin()
	{
		signUpArray.add(new unit.SignUp());
	}

}
