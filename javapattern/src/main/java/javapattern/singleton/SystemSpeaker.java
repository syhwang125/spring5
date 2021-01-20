package javapattern.singleton;

public class SystemSpeaker {

	 private static SystemSpeaker instance;
	 private int volumn; 
	 
	 private SystemSpeaker() {
		 volumn = 6;
	 }
	 
	 public static SystemSpeaker getInstance() {
		 if (instance == null) {
			 instance = new SystemSpeaker();
			 System.out.println(" 인스턴스 새로 생성 ");
		 } else {
			 System.out.println(" 인스턴스 이미 존재 ");
		 }
		 return instance;
	 }

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	 
}
