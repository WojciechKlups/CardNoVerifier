package pl.sda.Detectors;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IssuerRuleBuilder {

    public List<IssuerRule> buildIssuerRules() {
        List<IssuerRule> issuerRules = new ArrayList<>();

        //TODO: zbudować listę issuer rules korzystając z pliku issuer.csv (na zasadzie MappingFileReader).

        File issuers = new File ("C:\\Users\\Wojtek\\IdeaProjects\\SDA_J13_CreditCards\\src\\main\\Resources\\issuers.csv");

        try {
            FileReader fileReader = new FileReader(issuers);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(";");
                issuerRules.add(new IssuerRule(values[0], values[1], Integer.parseInt(values[2])));
            }
        } catch (FileNotFoundException e) {
            throw new ListingNotFoundException("The file was not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return issuerRules;
    }
}
