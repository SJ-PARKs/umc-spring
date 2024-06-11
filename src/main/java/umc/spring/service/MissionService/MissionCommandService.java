package umc.spring.service.MissionService;

import umc.spring.domain.mapping.MemberMission;
import umc.spring.web.dto.MissionRequestDTO;

public interface MissionCommandService {
    MemberMission createMemberMission(MissionRequestDTO.ChallengeMissionDTO request);
}
