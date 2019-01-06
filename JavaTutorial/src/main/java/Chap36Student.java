import java.io.Serializable;

// Exception in thread "main" java.io.NotSerializableException: Chap36Student

public class Chap36Student implements Serializable {
	/**
	 * 업데이트 했을때 버전 관리를 위해 자동으로 관리함. 
	 */
	private static final long serialVersionUID = -2105191535756783420L;
	
	// transient 를 선언하면 직렬화할때 해당 변수는 저장하지 않음 
	// private transient int id;     default 값인 int =0, string = null 로 저장됨 
	private int id;
	private String major;
	private String name;
	
	public Chap36Student(int id, String major, String name) {
		this.id = id;
		this.name = name;
		this.major = major;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
