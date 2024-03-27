package springCore.standalon.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Parson {

	private List<String> friend;
	
	private Map <String , Integer> course;
	
	private Properties prop;

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}

	public Map<String, Integer> getCourse() {
		return course;
	}

	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Parson [friend=" + friend + ", course=" + course + ", prop=" + prop + "]";
	}

	
	
}
