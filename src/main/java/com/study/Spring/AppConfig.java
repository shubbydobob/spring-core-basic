package com.study.Spring;

import com.study.Spring.discount.DiscountPolicy;
import com.study.Spring.discount.FixDiscountPolicy;
import com.study.Spring.member.MemberRepository;
import com.study.Spring.member.MemberService;
import com.study.Spring.member.MemberServiceImpl;
import com.study.Spring.member.MemoryMemberRepository;
import com.study.Spring.order.OrderService;
import com.study.Spring.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
