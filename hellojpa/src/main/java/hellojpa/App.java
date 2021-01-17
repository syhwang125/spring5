package hellojpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

import hellojpa.entity.Member;
import hellojpa.entity.Team;

@RestController
@EnableAutoConfiguration

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		try {
			
			// 등록 
			Team team = new Team();
//			team.setId(1L);
			team.setName("teamB");
			em.persist(team);
			
			
			// 회원 등록 
			Member member = new Member();
//			member.setId(101L);
			member.setName("hello");
//			member.setMemberType(MemberType.USER);
//			member.setTeamId(team.getId());
			em.persist(member);
			
			// 역방향(주인이 아닌 방향)만 연관관계 설정 
			team.getMembers().add(member);
//			member.setTeam(team);   //단방향 연관관계 설정, 참조 저장 			
			

			em.flush();   // 쿼리를 db 에 다 보낸다 
			em.clear();   // 캐쉬 클리어 

			
			// 조회 
			Member findMember = em.find(Member.class, member.getId());
//			Team findTeam = findMember.getTeam();
			
			findMember.setName("t아카데미");		
			
			// 검색 
//			String jpql = "select m From  Member m where m.name like '%dooly%' "; 
			String jpql = "select m From  Member m  join fetch m.team "; 
			List<Member> result = em.createQuery(jpql, Member.class)
					                .setFirstResult(10)
					                .setMaxResults(20)
					                .getResultList();

			
//			tx.commit();
			
//			int memberSize = findTeam.getMembers().size();
//			findTeam.getName(); // fetchtype=lazy로 한 경우 다시 쿼리 해줌 
//			
//			List<Member> members = findTeam.getMembers();
//			for (Member member1 : members ) {
//				System.out.println("member1 = " + member1) ;
//			}
//			
//			System.out.println("Hello jpa" + findTeam);
			
//			System.out.println(" memberSize : " + memberSize);
		} catch (Exception e) {
			tx.rollback();
		} finally {
			emf.close();
		}
	}

}
