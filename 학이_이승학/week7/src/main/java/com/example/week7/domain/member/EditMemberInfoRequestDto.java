package com.example.test_week7.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditMemberInfoRequestDto {

    private String nickname;
    private String phone;
    private String location;
}
