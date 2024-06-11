package umc.spring.converter;

import umc.spring.domain.Mission;
import umc.spring.domain.Region;
import umc.spring.domain.Review;
import umc.spring.domain.Store;
import umc.spring.web.dto.MissionRequestDTO;
import umc.spring.web.dto.MissionResponseDTO;
import umc.spring.web.dto.StoreRequestDTO;
import umc.spring.web.dto.StoreResponseDTO;

import java.time.LocalDateTime;

public class StoreConverter {

    public static Store toStore(StoreRequestDTO.StoreDTO request, Region region) {
        return Store.builder()
                .region(region)
                .name(request.getName())
                .score(0.0f)
                .address(request.getAddress())
                .build();
    }

    public static StoreResponseDTO.CreateStoreResultDTO toCreateStoreResultDTO(Store store) {
        return StoreResponseDTO.CreateStoreResultDTO.builder()
                .storeId(store.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }
    public static Review toReview(StoreRequestDTO.ReviewDTO request){
        return Review.builder()
                .title(request.getTitle())
                .score(request.getScore())
                .body(request.getBody())
                .build();
    }

    public static StoreResponseDTO.CreateReviewResultDTO toCreateReviewResultDTO(Review review){
        return StoreResponseDTO.CreateReviewResultDTO.builder()
                .reviewId(review.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }


    public static Mission toMission(MissionRequestDTO.MissionDTO dto) {
        return Mission.builder()
                .reward(dto.getReward())
                .deadline(dto.getDeadline())
                .missionSpec(dto.getMissionSpec())
                .build();
    }
    public static MissionResponseDTO.CreateMissionResultDTO toCreateMissionResultDTO(Mission mission){
        return MissionResponseDTO.CreateMissionResultDTO.builder()
                .missionId(mission.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }
}