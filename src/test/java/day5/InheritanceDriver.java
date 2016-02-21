package day5;

public class InheritanceDriver {

	public static void main(String[] args) {
		
		/*PageA  a = new PageA(); //used before inheritance
		a.add();
		System.out.println("Result from PageA "+a.result);
		
		PageB b = new PageB();
		b.add2sub10();
		System.out.println("Result from PageB " + b.result);
		
		PageC c = new PageC();
		c.add2Sub10div10();
		System.out.println("REsult from PAgeC " + c.result);
	*/
		//including PAge A and Page B
		/*PageB b = new PageB();
		b.add();
		System.out.println("REsult of add method :"+ b.result);
		b.add2sub10();
		System.out.println("REsult of add2sub10 method :"+ b.result);
	*/
		
		
		//A ,B, and C
		
		PageC c = new PageC();
		c.add();
		System.out.println("REsult of add method :"+ c.result);
		c.add2sub10();
		System.out.println("REsult of add2sub10 method :"+ c.result);
		c.add2Sub10div10();
		System.out.println("REsult of add2Sub10div10 method :"+ c.result);
		c.getadd();
	}

}
