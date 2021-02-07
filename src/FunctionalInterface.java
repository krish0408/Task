
public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable runnable = ()-> {
			System.out.println("Lambda implenting Runnable");
			
		};
		Thread thread = new Thread(runnable);
		thread.setName("Thread");

		thread.start();
	}

}
