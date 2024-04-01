package springCore.bean;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
//import javax.annotation.PostConstruct;

//public class Student implements InitializingBean, DisposableBean {
public class Student {

	private String name;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Seting name");
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {

		System.out.println("Seting city");
		this.city = city;
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@PreDestroy
	public void destroy() {
		System.out.println("destroy method call");
		name = "";
	}

//	@PostConstruct
	public void init() {
		System.out.println("init method call");
		name = "radhe";
		city = "amla";
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception { // TODO
	 * Auto-generated method stub
	 * System.out.println("afterPropertiesSet method call"); name = "radhe"; city =
	 * "amla"; }
	 * 
	 * @Override public void destroy() throws Exception { // TODO Auto-generated
	 * method stub System.out.println("destroy method calls"); }
	 */
}
