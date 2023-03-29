package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzbuzz = new FizzBuzz(15);
    FizzBuzz fizz = new FizzBuzz(9);
    FizzBuzz buzz = new FizzBuzz(20);
    FizzBuzz numberAsString = new FizzBuzz(16);

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
        String actualString = fizz.multipleOfThree();

        //Assert
        assertEquals(expectedString, actualString);
    }

    @Test
    void toReturnBuzz(){

        //Arrange
        String expectedString = "Buzz";

        //Act
        String actualString = buzz.multipleOfFive();

        //Assert
        assertEquals(expectedString, actualString);
    }

    void toReturnNumber(){

        //Arrange
        String expectedString = "15";

        //Act
        String actualstring = numberAsString.notMultipleOfAny();

        //Assert
        assertEquals(expectedString, actualstring);
    }
}
