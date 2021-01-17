package hellojpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Member {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="USERNAME", nullable=false, length=20)
	private String name;
	
	private int age;
	
//	@Enumerated(EnumType.STRING)
//	private MemberType memberType;
	
//	public MemberType getMemberType() {
//		return memberType;
//	}
//	public void setMemberType(MemberType memberType) {
//		this.memberType = memberType;
//	}
	
//	@Column(name="TEAM_ID")
//	private Long teamId;
//	
//	public Long getTeamId() {
//		return teamId;
//	}
//
//	public void setTeamId(Long teamId) {
//		this.teamId = teamId;
//	}

	
//	@ManyToOne
	@ManyToOne(fetch = FetchType.LAZY)   // join 하기 싫은 경우 
	@JoinColumn(name = "TEAM_ID")
	private Team team;
	
	public Member() {
		
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	public Team getTeam() {
		return team;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
