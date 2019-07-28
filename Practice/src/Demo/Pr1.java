package Demo;


public class Pr1 {
	int rollNo;
	String name;
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Pr1 pr=new Pr1();
		pr.setName("Sakshi");
		pr.setRollNo(101);
		System.out.println(pr.getRollNo());
		System.out.println(pr.getName());
	

	}

}
