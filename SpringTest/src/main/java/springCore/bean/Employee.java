package springCore.bean;

public class Employee {

	private String eid;
	private String ename;
	private float esal;
	private String eaddr;
	private Account acc;

	static {
		System.out.println("employee lod");
	}

	// Employee Instantiate using Static method
	public static Employee getInstance() {
		System.out.println("Epmloyee Static method run");
		return new Employee();
	}

	public Employee() {
		super();
		System.out.println("Employee Constructore");
		// TODO Auto-generated constructor stub
	}

	public Employee(String eid, String ename, float esal, String eaddr, Account acc) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
		this.acc = acc;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	public String getEaddr() {
		return eaddr;
	}

	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eaddr=" + eaddr + ", acc=" + acc
				+ "]";
	}

}
