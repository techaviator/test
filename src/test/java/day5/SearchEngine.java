package day5;

public interface SearchEngine {
	
	public void initializeBrowser(String browser);
	public void searchString(String searchtext);
	public void displayResult();
	public void tearDown();

}
