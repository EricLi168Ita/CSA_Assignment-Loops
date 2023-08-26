import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

public class BagApplesTest {
    @DisplayName("bagApples Test 1")
    @Test
    void bagApples_Test01 (){
        double targetWeight = 10;
        double variation = 0.5;
        int min = (int)((targetWeight - variation) / 2);
        int max = (int)((targetWeight - variation) / 0.5);
        int received = AppleBag.bagApples(targetWeight, variation);
        assertTrue(received >= min && received <= max);
    }

    @DisplayName("bagApples Test 2")
    @Test
    void bagApples_Test02 (){
        double targetWeight = 15;
        double variation = 0.4;
        int min = (int)((targetWeight - variation) / 2);
        int max = (int)((targetWeight - variation) / 0.5);
        int received = AppleBag.bagApples(targetWeight, variation);
        assertTrue(received >= min && received <= max);
    }

    @DisplayName("bagApples Test 3")
    @Test
    void bagApples_Test03 (){
        double targetWeight = 20;
        double variation = 1.0;
        int min = (int)((targetWeight - variation) / 2);
        int max = (int)((targetWeight - variation) / 0.5);
        int received = AppleBag.bagApples(targetWeight, variation);
        assertTrue(received >= min && received <= max);
    }

    @DisplayName("bagApples Test 4")
    @Test
    void bagApples_Test04 (){
        double targetWeight = 5;
        double variation = 0.2;
        int min = (int)((targetWeight - variation) / 2);
        int max = (int)((targetWeight - variation) / 0.5);
        int received = AppleBag.bagApples(targetWeight, variation);
        assertTrue(received >= min && received <= max);
    }

    @DisplayName("bagApples Test 5")
    @Test
    void bagApples_Test05 (){
        double targetWeight = 15;
        double variation = 1.5;
        int min = (int)((targetWeight - variation) / 2);
        int max = (int)((targetWeight - variation) / 0.5);
        int received = AppleBag.bagApples(targetWeight, variation);
        assertTrue(received >= min && received <= max);
    }

    @DisplayName("bagApples Test 6")
    @Test
    void bagApples_Test06 (){
        double targetWeight = 30;
        double variation = 0.1;
        int min = (int)((targetWeight - variation) / 2);
        int max = (int)((targetWeight - variation) / 0.5);
        int received = AppleBag.bagApples(targetWeight, variation);
        assertTrue(received >= min && received <= max);
    }

    @DisplayName("bagApples Test 7")
    @Test
    void bagApples_Test07 (){
        double targetWeight = 2;
        double variation = 0.1;
        int min = (int)((targetWeight - variation) / 2);
        int max = (int)((targetWeight - variation) / 0.5);
        int received = AppleBag.bagApples(targetWeight, variation);
        assertTrue(received >= min && received <= max);
    }

    @DisplayName("bagApples Test 8")
    @Test
    void bagApples_Test08 (){
        double targetWeight = 7;
        double variation = 0.6;
        int min = (int)((targetWeight - variation) / 2);
        int max = (int)((targetWeight - variation) / 0.5);
        int received = AppleBag.bagApples(targetWeight, variation);
        assertTrue(received >= min && received <= max);
    }

    @DisplayName("bagApples Test 9")
    @Test
    void bagApples_Test09 (){
        double targetWeight = 17;
        double variation = 0.8;
        int min = (int)((targetWeight - variation) / 2);
        int max = (int)((targetWeight - variation) / 0.5);
        int received = AppleBag.bagApples(targetWeight, variation);
        assertTrue(received >= min && received <= max);
    }

    @DisplayName("bagApples Test 10")
    @Test
    void bagApples_Test10 (){
        double targetWeight = 14;
        double variation = 2.0;
        int min = (int)((targetWeight - variation) / 2);
        int max = (int)((targetWeight - variation) / 0.5);
        int received = AppleBag.bagApples(targetWeight, variation);
        assertTrue(received >= min && received <= max);
    }
}
