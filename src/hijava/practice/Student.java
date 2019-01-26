package hijava.practice;

public class Student {
	private String ID;
	private String name;
	private int age;
	private String telno;

	public Student() {

	}

	public Student(String name) {
		this.setName(name);

	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		if (this.telno == null || telno.legth() < 4 ) {
			return telno;
		}
		this.telno = telno;
	}

	public int getAge() {
		return age;

	}

	public void setAge(int age) {
		this.age = age;
	}
}
