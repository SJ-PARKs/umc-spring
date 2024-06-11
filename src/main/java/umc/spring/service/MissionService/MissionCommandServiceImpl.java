package umc.spring.service.MissionService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.converter.MissionConverter;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.repository.MemberMissionRepository;
import umc.spring.repository.MemberRepository;
import umc.spring.repository.MissionRepository;
import umc.spring.web.dto.MissionRequestDTO.ChallengeMissionDTO;

@Service
@Transactional
@RequiredArgsConstructor
public class MissionCommandServiceImpl implements MissionCommandService{

    private final MemberMissionRepository memberMissionRepository;
    private final MemberRepository memberRepository;
    private final MissionRepository missionRepository;

    //mission-member
    @Override
    public MemberMission createMemberMission(ChallengeMissionDTO request) {
        MemberMission memberMission = MissionConverter.toMemberMission(request);

        memberMission.setMember(memberRepository.findById(request.getMemberId()).get());
        memberMission.setMission(missionRepository.findById(request.getMissionId()).get());

        return memberMissionRepository.save(memberMission);
    }
}