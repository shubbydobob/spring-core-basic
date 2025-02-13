package com.study.Spring.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
