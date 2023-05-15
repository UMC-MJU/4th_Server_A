package com.example.week7.domain.member;

import com.example.week7.domain.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static com.example.week7.domain.response.Response.success;
import static com.example.week7.domain.response.SuccessMessage.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/search")
    public Response getMemberInfo(Long memberId) {
        return success(SUCCESS_TO_GET_MEMBER, memberService.getMemberInfo(memberId));
    }

    @PatchMapping("/change")
    public Response editMemberInfo(@RequestBody EditMemberInfoRequestDto editMemberInfoRequestDto, Long memberId) {
        memberService.editMemberInfo(editMemberInfoRequestDto, memberId);
        return success(SUCCESS_TO_EDIT_MEMBER);
    }

    @DeleteMapping("delete")
    public Response deleteMember(Long memberId) {
        memberService.deleteMember(memberId);
        return success(SUCCESS_TO_DELETE_MEMBER);
    }
}
