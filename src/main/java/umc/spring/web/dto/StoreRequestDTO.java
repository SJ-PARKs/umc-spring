package umc.spring.web.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class StoreRequestDTO {

    @Getter
    public static class StoreDTO {
        @NotBlank
        String region;
        @NotBlank
        String name;
        @NotBlank
        String address;
    }
    @Getter
    public static class ReviewDTO{
        @NotBlank
        String title;
        @NotNull
        Float score;
        @NotBlank
        String body;
    }
    @Getter
    public static class MissionDTO {
        @NotNull
        Integer reward;
        @NotNull
        LocalDate deadLine;
        @NotBlank
        String missionSpec;
    }

}