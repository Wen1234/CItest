package calc;

public class CalculatorMain {
	public CalculatorMain(){
		
	}
	public int add(int a, int b){
		int res=add(a,b);
		System.out.println("Addition:"+res);
		return a+b;
	}
	public int sub(int a, int b) {
		int res=sub(a,b);
		System.out.println("Subtracion::"+res);
		return a-b;
	}
 
	
}
