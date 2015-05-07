package extender;

import java.util.ArrayList;

import javax.servlet.ServletContext;

public class AccountList {
	
	context.UseContext useContext;
	
	public void setUseContext(ServletContext context) {
		this.useContext = new context.UseContext(context);
	}
	
		public ArrayList<String> getAccountList()
		{
			ArrayList<String> result = new ArrayList<String>();
			String promoted;
			for(unit.SignUp signUp : useContext.useSignUpArray())
			{
				if(signUp.isPremiumCheck()) promoted="Yes";
				else promoted="No";
				result.add("Username: "+signUp.getUsername()+" Premiumed: "+promoted);
			}
			return result;
		}
	}
