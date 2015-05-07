package extender;

import javax.servlet.ServletContext;

public class Pacc {
	
	find.Pacc findPacc = new find.Pacc();
	
	public boolean premium(String username, ServletContext context)
	{
		findPacc.setUseContext(context);
		if(findPacc.findPacc(username, true)) return true;
		return false;
	}
	
	public boolean badPremium(String username, ServletContext context)
	{
		findPacc.setUseContext(context);
		if(findPacc.findPacc(username, false)) return true;
		return false;
	}

}
