package hellojpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {

	@Id @GeneratedValue
	private Long id;
	
	@Column(name="TEAMNAME", nullable=false, length=20)
	private String name;
	
	// 연관관계의 주인만이 외래키를 관리할 수 있으며, 주인이 아니면 mappedBy 속성으로 지정 
	@OneToMany(mappedBy = "team")
	private List<Member> members = new ArrayList<Member>();
	
	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
