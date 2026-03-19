package be.ses.javatest;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void gegevenXis4enYis2_wanneerDivide_danResultIs2(){
        // 1. Arrange
        Calculator calc = new Calculator();
        float x = 4.0f;
        float y = 2.0f;

        // 2. Act
        float result =calc.divide(x,y);

        // 3. Assert
        assertThat(result).isEqualTo(2.0f);
    }
    @Test
    public void gegevenXis4enYis2_WanneerMultiply_danResultIs8(){
        // 1. Arrange
        Calculator calc = new Calculator();
        float x = 4.0f;
        float y = 2.0f;

        // 2. Act
        float result =calc.multiply(x,y);

        // 3. Assert
        assertThat(result).isEqualTo(8.0f);
    }
    @Test
    public void gegevenXis4enYis2_wanneerPlus_danResultIs6(){
        // 1. Arrange
        Calculator calc = new Calculator();
        float x = 4.0f;
        float y = 2.0f;

        // 2. Act
        float result =calc.plus(x,y);

        // 3. Assert
        assertThat(result).isEqualTo(6.0f);
    }
    @Test
    public void gegevenXis4enYis2_wanneerMin_danResultIs2(){
        // 1. Arrange
        Calculator calc = new Calculator();
        float x = 4.0f;
        float y = 2.0f;

        // 2. Act
        float result =calc.min(x,y);

        // 3. Assert
        assertThat(result).isEqualTo(2.0f);
    }

    @Test
    public void gegevenXis4_wanneervierkantswortel_danResultIs2(){
        // 1. Arrange
        Calculator calc = new Calculator();
        float x = 4.0f;

        // 2. Act
        float result = calc.vierkantswortel(x);

        // 3. Assert
        assertThat(result).isEqualTo(2.0f);
    }

}