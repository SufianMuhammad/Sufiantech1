package my_thirdprogram;
public class Main {
public static void main(String args[]) {
	int x;
	//var type var name
	//x = 10;
	Human sufian;
	sufian = new Human();
	sufian.name = "sufian";
	sufian.age = 46;

	Human rajib;
	rajib = new Human();
	rajib.name = "rajib";	
	rajib.age = 35;

	System.out.println(sufian.name);
	System.out.println("eat");
	System.out.println("46");
	System.out.println(rajib.name);
	System.out.println("eat");
	System.out.println("35"); 
	
}

}