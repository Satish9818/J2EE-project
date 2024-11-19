package classloaderss;

public class TestLoading {

	public static void main(String[] args) {
		
		System.out.println("MAIN STARTS");
		
//		
//		LoadingByForName.hello();
		try {
			Class.forName("classloaderss.LoadingByForName");
		}
		catch(ClassNotFoundException e){
			System.out.println("THE CLASSNAME IS INCORRECT");
		}
		System.out.println("MAIN ENDS");
	}

	static {
		System.out.println("TESTLOADING CLASS IS LOADED INTO JVM MEMORY");
	}
}
