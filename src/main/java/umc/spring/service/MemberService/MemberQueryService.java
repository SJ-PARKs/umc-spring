package umc.spring.service.MemberService;

import org.springframework.data.domain.Page;
import umc.spring.domain.Member;
import umc.spring.domain.mapping.MemberMission;

import java.util.Optional;

public interface MemberQueryService {

    Optional<Member> findMember(Long id);
    Page<MemberMission> getMemberMissionListByMemberId(Long memberId, Integer page);

}