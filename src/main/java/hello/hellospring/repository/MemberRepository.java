package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원 저장
    Optional<Member> findById(Long id); //회원 id 찾아옴
    Optional<Member> findByName(String name); //회원 name을 찾아옴
    List<Member> findAll(); //저장된 모든 리스트를 반환함
}
