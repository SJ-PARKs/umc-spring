package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Member;
import umc.spring.domain.Mission;
import umc.spring.domain.mapping.MemberMission;

import java.util.Optional;
public interface MemberMissionRepository extends JpaRepository<MemberMission, Long> {
    Optional<MemberMission> findByMemberAndMission(Member member, Mission mission);
}
