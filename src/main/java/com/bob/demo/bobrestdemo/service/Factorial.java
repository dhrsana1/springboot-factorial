package com.bob.demo.bobrestdemo.service;

import java.math.BigInteger;

import org.springframework.stereotype.Component;



@Component
public interface Factorial {
    BigInteger calculateFactorial(int p);

}
