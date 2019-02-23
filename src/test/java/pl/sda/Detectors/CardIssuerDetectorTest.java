package pl.sda.Detectors;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardIssuerDetectorTest {

    @Test
    public void shouldReturnMasterCard() {
        //Given
        final String cardNumber = "5500000000000000";
        final String expectedResult = "Master Card";
        final IDetector detector = new CardIssuerDetector();

        //When
        String result = detector.detect(cardNumber);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturnVisa() {
        //Given
        final String cardNumber = "4500000000000000";
        final String expectedResult = "Visa";
        final IDetector detector = new CardIssuerDetector();

        //When
        String result = detector.detect(cardNumber);

        //Then
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void shouldReturnAmericanExpress() {
        //Given
        final String cardNumber = "340000000000000";
        final String expectedResult = "American Express";
        final IDetector detector = new CardIssuerDetector();

        //When
        String result = detector.detect(cardNumber);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturnUnknown() {
        //Given
        final String cardNumber = "0000000000000000";
        final String expectedResult = "Unknown";
        final IDetector detector = new CardIssuerDetector();

        //When
        String result = detector.detect(cardNumber);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

}