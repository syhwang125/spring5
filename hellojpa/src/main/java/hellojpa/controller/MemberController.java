package hellojpa.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hellojpa.entity.Member;
import hellojpa.repository.MemberRepository;


@RestController
public class MemberController {

	@Autowired
	private Member member;
	
	@Autowired
	MemberRepository repository;
	
	@PostConstruct
	public void init() {
		repository.save(new Member("dooly1", 1));
		repository.save(new Member("dooly2", 2));
		repository.save(new Member("dooly3", 3));
		repository.save(new Member("dooly4", 4));
		repository.save(new Member("dooly5", 5));
		
	}
	
	@GetMapping("/hello")
	public Member member() {
		return repository.findByName("dooly1");
	}
	
//	@RequestMapping("/members")
//	public List<Member> members() {
//		return repository.findAll();
//	}
	
	@RequestMapping("/members/{memberId}")
	public Member member(@PathVariable("memberId") Member member) {
		return member; 
	};
	
	
	@RequestMapping("/hellopage")
	public Page<Member> memberPage() {
		PageRequest pageRequest = PageRequest.of( 1, 5);
		return repository.findByName("dooly", pageRequest);
	}
	
	@RequestMapping("/members")
	public List<Member> members() {
		PageRequest pageRequest = PageRequest.of(1,5);
		return repository.findAll();
	}
	

}
