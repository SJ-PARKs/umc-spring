package umc.spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.converter.MissionConverter;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.service.MissionService.MissionCommandService;
import umc.spring.validation.annotation.MissionChallenging;
import umc.spring.web.dto.MissionRequestDTO;
import umc.spring.web.dto.MissionResponseDTO;

import javax.validation.Valid;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/missions")
public class MissionRestController {
    private final MissionCommandService missionCommandService;
    @PostMapping("/challenge")
    public ApiResponse<MissionResponseDTO.CreateMemberMissionResultDTO> createChallengingMemberMission(
            @RequestBody @Valid @MissionChallenging(memberIdField = "memberId", missionIdField = "missionId")
            MissionRequestDTO.ChallengeMissionDTO request) {
        MemberMission memberMission = missionCommandService.createMemberMission(request);
        return ApiResponse.onSuccess(MissionConverter.toCreateMemberMissionDTO(memberMission));
    }
}
