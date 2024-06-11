package umc.spring.service.MissionService;

import umc.spring.domain.Member;
import umc.spring.domain.Mission;
import umc.spring.domain.mapping.MemberMission;

import java.util.Optional;

public interface MissionQueryService {

    Optional<Mission> findMission(Long id);

    Optional<MemberMission> findMemberMission(Member member, Mission mission);
}