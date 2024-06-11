package umc.spring.web.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class MissionRequestDTO {

    @Getter
    public static class MissionDTO {
        @NotNull
        private String missionName;

        @NotNull
        private Integer reward;

        @NotNull
        private LocalDate deadline;

        @NotNull
        private String missionSpec;

    }

    @Getter
    public static class ChallengeMissionDTO {
        @NotNull
        Long memberId;
        @NotNull
        Long missionId;
    }

}
