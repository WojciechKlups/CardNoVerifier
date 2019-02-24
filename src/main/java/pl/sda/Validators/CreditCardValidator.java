package pl.sda.Validators;

import pl.sda.Detectors.CardIssuerDetector;
import pl.sda.Verifiers.LuhnChecksumVerifier;

public class CreditCardValidator {

    public ValidationResult validate (String cardNumber, String customFilePath) {
        ValidationResult result = new ValidationResult();

        CardIssuerDetector cardIssuerDetector = new CardIssuerDetector();
        String issuerName = cardIssuerDetector.detect(cardNumber, customFilePath);
        result.setIssuerName(issuerName);


        LuhnChecksumVerifier luhnChecksumVerifier = new LuhnChecksumVerifier();
        boolean isLuhnPassed = luhnChecksumVerifier.verify(cardNumber);
        result.setIsluhnPassed(isLuhnPassed);

        return result;
    }

}
