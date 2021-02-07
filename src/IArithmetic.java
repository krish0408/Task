
public interface IArithmetic {
	
	int sum(int a,int b);
	

	
	IArithmetic ar = (int a,int b) -> {
		
		System.out.println("Sum:");
		return a+b;
	};
	}	
