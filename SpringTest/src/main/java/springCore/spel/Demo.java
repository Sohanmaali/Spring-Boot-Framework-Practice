package springCore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{10+20+30}")
	private int x ;
	
	@Value("#{10+30}")
	private int y ;

	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int z ;

	@Value("#{T(java.lang.Math).PI}")
	private double pi ;
	
	@Value("#{new String('SOHAN')}")
	private String name;
	
	@Value("#{5>3}")
	private boolean isActive;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}

	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Demo [x = " + x + ", y = " + y + ", z = " + z + ", pi = " + pi + ", name = " + name + ", isActive = " + isActive
				+ "]";
	}
	
	
}
