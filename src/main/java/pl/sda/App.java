package pl.sda;

import pl.sda.Validators.CreditCardValidator;
import pl.sda.Validators.ValidationResult;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       if (args != null && args.length > 0) {
           String customFilePath = null;
           if(args.length > 1) {
               customFilePath = args[1];
           }
           String cardNumber = args[0];
           CreditCardValidator validator = new CreditCardValidator();
           ValidationResult validationResult = validator.validate(cardNumber, customFilePath);

           System.out.println("Issuer: " + validationResult.getIssuerName());
           System.out.println("Luhn test passed: " + validationResult.isIsluhnPassed());

       } else {
           System.out.println("There are no parameters!");
       }

    }
}
