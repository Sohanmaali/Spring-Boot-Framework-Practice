package springCore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	private Properties pro;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	public Student(List<String> list, Set<String> set, Map<String, String> map, Properties pro) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
		this.pro = pro;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [list = " + list + ",\n set = " + set + ",\n map = " + map + ",\n pro = " + pro + "]";
	}

}
