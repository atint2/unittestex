package tests;

import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Snake;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SnakeTests {

    private static Snake actualSnake;

    @BeforeAll
    public static void createAnimals()
    {
        actualSnake = new Snake(AnimalType.DOMESTIC, Skin.SCALES, Gender.UNKNOWN, Breed.UNKNOWN);
    }


    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualSnake.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualSnake.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Snake Speak Prrr Tests")
    public void snakeGoesPsssssTest()
    {
        assertEquals("The snake goes psssss!", actualSnake.speak(), "I was expecting psssss");
    }

    @Test
    @Order(1)
    @DisplayName("Snake scales is it Hyperallergetic")
    public void snakeHyperAllergeticTests()
    {
        assertEquals("The snake is not hyperallergetic!", actualSnake.snakeHypoallergenic(),
                "The snake is not hyperallergetic!");
    }

    @Test
    @Order(1)
    @DisplayName("Snake has legs Test")
    public void legTests()
    {
        Assertions.assertNotNull(actualSnake.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Snake Gender Test FeMale")
    public void genderTestFeMale()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.UNKNOWN);
        assertEquals(Gender.FEMALE, actualSnake.getGender(), "Expecting Female Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Breed Test BURMESE_PYTHON")
    public void genderSnakeBreed()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.BURMESE_PYTHON);
        assertEquals(Breed.BURMESE_PYTHON, actualSnake.getBreed(), "Expecting Breed Burmese Python!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Speak Hiss Tests")
    public void snakeGoesHissTest()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes Hiss! Hiss!", actualSnake.speak(), "I was expecting hiss");
    }
}
