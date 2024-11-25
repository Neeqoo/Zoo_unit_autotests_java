package com.example;

import org.junit.Assert;
import org.junit.Test;



//-->   В задании не было указано что класс Animal тоже должен быть покрыт на 100%, прошу понять и простить)))


public class AnimalTest {



    @Test
    public void testConstructIncorrectAnimalKind() {

        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("Incorrect");
        });
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }



    @Test
    public void testGetFamaly() {
        String expectedString = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        Assert.assertEquals("Неверные перечисления семейств",expectedString, animal.getFamily());
    }

}
