package com.study.Spring;

import com.study.Spring.member.Grade;
import com.study.Spring.member.Member;
import com.study.Spring.member.MemberService;
import com.study.Spring.member.MemberServiceImpl;
import com.study.Spring.order.Order;
import com.study.Spring.order.OrderService;
import com.study.Spring.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
