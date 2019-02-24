package pl.sda.Validators;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardValidatorTest {

//            5149273068100605
//            5538952797967959
//            5551001284342458
//            5205143106994957

    @Test
    public void shouldReturnMasterCardAndTrueFor5149273068100605(){
        //Given
        final String cardNumber = "5149273068100605";
        final String expectedIssuer = "Master Card";
        final String filePath = "C:\\myrules.csv";
        final boolean expectedLuhnResult = true;
        CreditCardValidator creditCardValidator = new CreditCardValidator();
        //When
        ValidationResult result = creditCardValidator.validate(cardNumber, filePath);
        //Then
        Assert.assertEquals(expectedIssuer, result.getIssuerName());
        Assert.assertTrue(result.isIsluhnPassed());
    }

    @Test
    public void shouldReturnMasterCardAndTrueFor5538952797967959(){
        //Given
        final String cardNumber = "5538952797967959";
        final String expectedIssuer = "Master Card";
        final String filePath = "C:\\myrules.csv";
        final boolean expectedLuhnResult = true;
        CreditCardValidator creditCardValidator = new CreditCardValidator();
        //When
        ValidationResult result = creditCardValidator.validate(cardNumber, filePath);
        //Then
        Assert.assertEquals(expectedIssuer, result.getIssuerName());
        Assert.assertTrue(result.isIsluhnPassed());
    }

    @Test
    public void shouldReturnMasterCardAndTrueFor5551001284342458(){
        //Given
        final String cardNumber = "5551001284342458";
        final String expectedIssuer = "Master Card";
        final String filePath = "C:\\myrules.csv";
        final boolean expectedLuhnResult = true;
        CreditCardValidator creditCardValidator = new CreditCardValidator();
        //When
        ValidationResult result = creditCardValidator.validate(cardNumber, filePath);
        //Then
        Assert.assertEquals(expectedIssuer, result.getIssuerName());
        Assert.assertTrue(result.isIsluhnPassed());
    }

    @Test
    public void shouldReturnMasterCardAndTrueFor5205143106994957(){
        //Given
        final String cardNumber = "5205143106994957";
        final String expectedIssuer = "Master Card";
        final String filePath = "C:\\myrules.csv";
        final boolean expectedLuhnResult = true;
        CreditCardValidator creditCardValidator = new CreditCardValidator();
        //When
        ValidationResult result = creditCardValidator.validate(cardNumber, filePath);
        //Then
        Assert.assertEquals(expectedIssuer, result.getIssuerName());
        Assert.assertTrue(result.isIsluhnPassed());
    }

    @Test
    public void shouldReturnMasterCardAndTrueFor5205143106994957v2(){
        //Given
        final String cardNumber = "5205143106994957";
        final String filePath = "C:\\myrules.csv";
        final ValidationResult expectedResult = new ValidationResult();
        expectedResult.setIssuerName("Master Card");
        expectedResult.setIsluhnPassed(true);

        CreditCardValidator creditCardValidator = new CreditCardValidator();
        //When
        ValidationResult result = creditCardValidator.validate(cardNumber, filePath);
        //Then
        Assert.assertEquals(expectedResult, result);
    }

}