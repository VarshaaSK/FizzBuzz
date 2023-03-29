package com.m2p;

public class FizzBuzz {
    
    private int number;
    FizzBuzz(int number){
        this.number = number;
    }
    public String multipleOfThreeAndFive() {
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        return "Does not Match";
    }


    public String multipleOfThree() {
        if(number % 3 == 0){
            return "Fizz";
        }
        return "Does not Match";
    }
}
