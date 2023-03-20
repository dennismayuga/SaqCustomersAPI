package ca.vanier;

public class Response {

	private String fname, lname;
	private int age;

	public Response() { // Default Constructor

	}

	public Response(String fname, String lname, int age) { // Constructor
		setFname(fname);
		setLname(lname);
		setAge(age);
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// This method takes the age variable and checks if the user is under 18.
	public boolean ageCheck(int age) {
		if (age < 18) {
			System.out.println("ERROR! Unfrotunately you are under 18 years of age and are unable to register.");
            return false;
		} else {
			System.out.println("			Entry Saved!\r\n" + "");
            return true;
       
		}
      
	}
}
