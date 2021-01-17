package hellojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hellojpa.entity.Team;

public interface ItemRepository extends JpaRepository<Team, Long>{

}
