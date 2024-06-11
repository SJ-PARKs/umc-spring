package umc.spring.service.MissionService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.spring.domain.Member;
import umc.spring.domain.Mission;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.repository.MemberMissionRepository;
import umc.spring.repository.MissionRepository;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MissionQueryServiceImpl implements MissionQueryService{

    private final MissionRepository missionRepository;
    private final MemberMissionRepository memberMissionRepository;

    @Override
    public Optional<Mission> findMission(Long id) {
        return missionRepository.findById(id);
    }

    @Override
    public Optional<MemberMission> findMemberMission(Member member, Mission mission) {
        return memberMissionRepository.findByMemberAndMission(member, mission);
    }
}