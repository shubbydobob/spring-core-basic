package com.study.Spring.member;

import com.study.Spring.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.result.StatusResultMatchersExtensionsKt.isEqualTo;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService =appConfig.memberService();
    }

    @Test
    void join(){
        Member member = new Member(1L, "memberA", Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
