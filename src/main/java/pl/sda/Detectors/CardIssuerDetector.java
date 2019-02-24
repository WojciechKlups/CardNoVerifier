package pl.sda.Detectors;

import java.util.ArrayList;
import java.util.List;

public class CardIssuerDetector implements IDetector {
    @Override
    public String detect(String cardNumber, String customFilePath) {
        String result = "Unknown";
        List<IssuerRule> issuerRules = getIssuerRules(customFilePath);
        for (IssuerRule rule : issuerRules) {
            if(cardNumber.startsWith(rule.getPrefix()) && cardNumber.length() == rule.getLength()) {
                result = rule.getName();
                break;
            }
        }
        return result;
    }

    private List<IssuerRule> getIssuerRules(String customFilePath) {

        IssuerRuleBuilder issuerRuleBuilder = new IssuerRuleBuilder();

        return issuerRuleBuilder.buildIssuerRules(customFilePath);
    }
}
