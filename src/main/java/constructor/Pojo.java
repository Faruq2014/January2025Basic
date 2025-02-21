package constructor;

public class Pojo {
	/* plain old java object
	 * build a student registration page
	 * all field are mandatory
	 */
	
	private int id;
	private String firstName;
	private String lastName;
	
	public Pojo(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Pojo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	// static block
	static{
            System.out.println("school name is TEP");}
	
	// instance block
	{System.out.println("hello object--");}
	
	public static void main(String[] args) {
		Pojo brain = new Pojo(1, "Brain", "K");
		System.out.println(brain);
		Pojo sutan = new Pojo(2, "Sultan", "K");
		System.out.println(sutan);
	}

}
