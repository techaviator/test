package day4;

public class DataEncapsulation {
	
	private int userid = 656463;
	private int branch = 001;
	private int area = 1001;
	private int acc_start = 300;
	private String acc;
	
	public String displayaccount(int user)
	{
		getaccountnumber(user);
		return acc;
	}
	private void getaccountnumber(int user)
	{
		if(userid==user)
		{
		 acc = acc_start+""+branch+""+userid+""+area;
		}
		
	}

}
