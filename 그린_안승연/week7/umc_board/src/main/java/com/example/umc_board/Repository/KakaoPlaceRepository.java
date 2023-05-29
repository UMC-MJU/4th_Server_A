package com.example.umc_board.Repository;

import com.example.umc_board.Entity.KakaoPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KakaoPlaceRepository extends JpaRepository<KakaoPlace, Long> {

}
