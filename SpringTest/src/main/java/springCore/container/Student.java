package springCore.container;

public class Student {

	private String name;

	private int roll;

	private byte mark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public byte getMark() {
		return mark;
	}

	public void setMark(byte mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", roll=" + roll + ", mark=" + mark + '}';
	}

	public void init() {
		System.out.println("inside init method");
	}
	public void destroy() {
		System.out.println("inside destroy method");
	}

}
