package pl.sda.Detectors;

import java.util.ArrayList;
import java.util.List;

public class CardIssuerDetector implements IDetector {
    @Override
    public String detect(String cardNumber) {
        String result = "Unknown";
        for (IssuerRule rule : getIssuerRules()) {
            if(cardNumber.startsWith(rule.getPrefix()) && cardNumber.length() == rule.getLength()) {
                result = rule.getName();
                break;
            }
        }
        return result;
    }

    private List<IssuerRule> getIssuerRules() {
        List<IssuerRule> issuerRules = new ArrayList<>();

        IssuerRuleBuilder issuerRuleBuilder = new IssuerRuleBuilder();

        issuerRuleBuilder.buildIssuerRules();
        return issuerRules;
    }
}
