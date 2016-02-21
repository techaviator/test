package day4;

public class sbidriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sbicalc_multiplebrowser obj = new sbicalc_multiplebrowser();
		obj.launchbrowser();
		obj.getElement();
		obj.validate();
		obj.tear_down();

	}

}
