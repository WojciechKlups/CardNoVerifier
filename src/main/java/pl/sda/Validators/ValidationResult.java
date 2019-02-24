package pl.sda.Validators;

public class ValidationResult {

    private String issuerName;
    private boolean isluhnPassed = false;

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public boolean isIsluhnPassed() {
        return isluhnPassed;
    }

    public void setIsluhnPassed(boolean isluhnPassed) {
        this.isluhnPassed = isluhnPassed;
    }

    @Override
    public boolean equals(Object obj) {
        ValidationResult comp = (ValidationResult) obj;

        return issuerName.equals(comp.getIssuerName()) && isluhnPassed == comp.isluhnPassed;
    }
}
