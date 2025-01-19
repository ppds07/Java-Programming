package dsa;

public class Lol {
	int roll; //global variable
	String name; //global variable
	
		Lol(int roll, String name){
			this.roll=0;
			this.name="";
			System.out.println("Contructor dada");
		}
		
		
		public void chu() {
			System.out.println("Chu invoked");
		}
		
	public static void main(String[] args)
	{
		Lol stu1 = new Lol(13,"bruh");
		Lol stu2 = new Lol(14,"bruhh");
		Lol stu3 = new Lol(15,"bruhhh");
		System.out.println(stu1.roll+stu1.name);
		System.out.println(stu2.roll+stu2.name);
		System.out.println(stu3.roll+stu3.name);
	}

}
