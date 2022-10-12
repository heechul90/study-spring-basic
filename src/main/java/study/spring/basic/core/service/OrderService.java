package study.spring.basic.core.service;

import study.spring.basic.core.domain.Order;

public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
