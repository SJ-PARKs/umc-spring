package umc.spring.converter;

import umc.spring.domain.enums.MissionStatus;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.web.dto.MissionRequestDTO;
import umc.spring.web.dto.MissionResponseDTO;

import java.time.LocalDateTime;

public class MissionConverter {

    //RequestDTO->Entity->DB저장
    public static MemberMission toMemberMission(MissionRequestDTO.ChallengeMissionDTO request) {
        return MemberMission.builder()
                .status(MissionStatus.CHALLENGING)
                .build();
    }


    //Entity->ResponseDTO
    public static MissionResponseDTO.CreateMemberMissionResultDTO toCreateMemberMissionDTO(
            MemberMission memberMission) {
        return MissionResponseDTO.CreateMemberMissionResultDTO.builder()
                .memberMissionId(memberMission.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

}
