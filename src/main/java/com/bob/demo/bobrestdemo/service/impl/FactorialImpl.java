package com.bob.demo.bobrestdemo.service.impl;

import java.math.BigInteger;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import com.bob.demo.bobrestdemo.service.Factorial;

@Component
@Service
public class FactorialImpl implements Factorial{

    @Override
    public BigInteger calculateFactorial(int p){
        StopWatch watch = new StopWatch();
        watch.start();
        BigInteger factorial = BigInteger.ONE; 
        for (int i = p; i > 0; i--) {
             factorial = factorial.multiply(BigInteger.valueOf(i)); 
             //System.out.println("Hi");
            }
        watch.stop();
        System.out.println("Time Elapsed in sec: " + watch.getTotalTimeMillis()/1000); // Prints: Time Elapsed: 2501
        return factorial;
    
    }
}
