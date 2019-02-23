package pl.sda.Verifiers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LuhnChecksumVerifierTest {

    @Test
    public void shouldReturnTrueForNumber594051(){
        //Given
        final String number = "594051";
        final boolean expectedResult = true;
        IChecksumVerifier verifier = new LuhnChecksumVerifier();

        //When
        boolean result = verifier.verify(number);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturnFalseForNumber594050(){
        //Given
        final String number = "594050";
        final boolean expectedResult = false;
        IChecksumVerifier verifier = new LuhnChecksumVerifier();

        //When
        boolean result = verifier.verify(number);

        //Then
        Assert.assertEquals(expectedResult, result);
    }

}