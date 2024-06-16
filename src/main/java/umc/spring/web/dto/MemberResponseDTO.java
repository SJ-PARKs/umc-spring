package umc.spring.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class MemberResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinResultDTO{
        Long memberId;
        LocalDateTime createdAt;
    }
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MissionPreViewListDTO{
        List<MissionPreViewDTO> missionList;
        Integer listSize;
        Integer totalPage;
        Long totalElements;
        Boolean isFirst;
        Boolean isLast;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MissionPreViewDTO{
        String missionSpec;
        Integer reward;
        LocalDate deadline;
        LocalDate createdAt;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MemberMissionResultDTO {
        Long missionId;
        LocalDateTime createdAt;
    }
}