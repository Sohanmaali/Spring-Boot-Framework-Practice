package springCore.SpringTest;

public class Student {
	
	private String name;
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}


	public Student() {
		super();
	}

}
