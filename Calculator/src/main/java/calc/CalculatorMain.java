package calc;

public class CalculatorMain {
	public CalculatorMain(){
		
	}
	public int add(int a, int b){
		int res=a+b;
		System.out.println("Addition:"+res);
		return a+b;
	}
	public int sub(int a, int b) {
		int res=a-b;
		System.out.println("Sub"+res);
		return a-b;
	}
    public int mul(int a, int b) {
    	    int res=a*b;
    	    System.out.println("Multiplication:"+res);
    	    return a*b;
    }
    public int div(int a, int b) {
		if(b==0)
		{
			return 0;
		}
		else {
			int res=a/b;
			System.out.println("Div:"+res);
			return a/b;
		}
	}
    public int rem(int a,int b)
    {
    	  int res=a%b;
    	  System.out.println("Reminder:"+res);
    	  return a%b;
    }
	
}
