package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {
//    @Autowired
//    Food pizza;
//    @Autowired
//    Food chicken;
    @Autowired
    @Qualifier("pizza")
    Food food;
// primary와 qualifier 중 우선순위는?
//    qualifier의 우선순위가 더 높음
    @Test
    @DisplayName("테스트")
    void test1() {
//        pizza.eat();
//        chicken.eat();
        food.eat();
    }
}
