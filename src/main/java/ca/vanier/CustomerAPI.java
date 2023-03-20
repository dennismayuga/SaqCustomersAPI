package ca.vanier;

public class CustomerAPI {

	public static void main(String[] args) throws Exception {
		try {
		CustomerManager.execute(args);
		}catch (Exception E) {
			System.out.println("Error... Invalid Arguments" + '\n' + E.getMessage());
			E.printStackTrace();
			throw new Exception();
		}


	}
}



