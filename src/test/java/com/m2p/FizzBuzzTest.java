package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz = new FizzBuzz(15);

    @Test
    void toReturnFizBuzz(){

        //Arrange
        String expectedString = "FizzBuzz";

        //Act
        String actualString = fizzbuzz.multipleOfThreeAndFive();

        //Assert
        assertEquals(expectedString , actualString);
    }

    @Test
    void toReturnFizz(){

        ///Arrange
        String expectedString = "Fizz";

        //Act
        String actualString = fizzbuzz.multipleOfThree();

        //Assert
        assertEquals(expectedString, actualString);
    }
}
