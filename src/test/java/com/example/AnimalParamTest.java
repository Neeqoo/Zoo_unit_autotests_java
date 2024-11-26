package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParamTest {

    private final String animalKind;
    private final List<String> expectedListOfFood;

    public AnimalParamTest(String animalKind, List<String> expectedListOfFood) {
        this.animalKind = animalKind;
        this.expectedListOfFood = expectedListOfFood;
    }

    @Parameterized.Parameters(name = "Класс Animal. Вид:{0}")
    public static Object[][] setKindForAnimal() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void testFoodIsCorrect() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals("Ошибка теста на вид", animal.getFood(animalKind), this.expectedListOfFood);
    }
}
