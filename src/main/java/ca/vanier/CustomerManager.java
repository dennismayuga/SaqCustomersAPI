package ca.vanier;

import java.util.ArrayList;

public class CustomerManager {
	static ArrayList<String> List = new ArrayList<>(); // GLOBAL ARRAYLIST
    

	public static void List() {
		// This method adds default values to the ArrayList
		List.add("Jrue Holiday, 65");
		List.add("Deanna Vic, 22");
		List.add("Alex Johnson, 39");
		List.add("Ryan Roddy, 52");
		List.add("Chris Bears, 19");
		List.add("Katarina Wu, 20");
		List.add("Von Poole, 40");
		List.add("John Doe, 36");
		List.add("Joao Silva, 25");
	}

	// This method checks through every arg in the args array to ensure they are fit
	// to pass through all other methods...
	public static boolean execute(String[] args) throws Exception {
		// Should receive something like this:
		// [ "Save, "John", "Doe", "18" ]
		// or
		// [ "List" ]



        boolean successfulTest = false;     // Successful is defaulted to false for testing purposes
        
		if (args[0].equalsIgnoreCase("list") && args.length < 2) {
			List();
			ArrayListIterator();
            successfulTest = true;
            return successfulTest;
		} else {

			String fname = null;
			String lname = null;
			int age = 0;

			try {
				if (args[0].equalsIgnoreCase("SAVE")) {
				} else {
					System.out.println("Error... Incorrect argument, expecting 'Save'");
	
				}
			} catch (Exception E) {
				System.out.println("Error... Not a String Value" + '\n' + E.getMessage());
				E.printStackTrace();
                throw new Exception();

			}
			try {
				fname = args[1].toLowerCase();
				lname = args[2].toLowerCase();
			} catch (Exception E) {
				System.out.println("Error... Not a String Value" + '\n' + E.getMessage());
				E.printStackTrace();
                throw new Exception();
			}

			try {
				age = Integer.valueOf(args[3]);
			} catch (Exception E) {
				System.out.println("Error... Incorrect argument, expecting an Integer Value" + '\n' + E.getMessage());
				E.printStackTrace();
                throw new Exception();
			}

			Response r = new Response(fname, lname, age);
			if(r.ageCheck(age) == true){
			List();
			List.add(fname + " " + lname + ", " + age);
			ArrayListIterator();
            successfulTest = true;
            return successfulTest;
            }
            else {
                return successfulTest;
            }
		}
	}

	// This method iterates through the ArrayList... can be converted to iterate
	// through a text file.
	public static void ArrayListIterator() {
		// Iterator
		for (String temp : List) {
			System.out.println(temp);
		}
	}
}
