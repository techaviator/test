package day4;

public class bigbasketdriver {
	public static void main(String[] args) throws InterruptedException {
		Bigbasket obj = new Bigbasket();
		obj.launchbrowser("http://www.bigbasket.com/choose-city/?next=/");
		obj.getfirstsearchdata();
		obj.tear_down();
	}

}
