package pl.sda.Detectors;

import pl.sda.App;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IssuerRuleBuilder {

    public List<IssuerRule> buildIssuerRules(String customFilePath) {
        List<IssuerRule> issuerRules = new ArrayList<>();
        String path = ("C:\\Users\\Wojtek\\IdeaProjects\\SDA_J13_CreditCards\\src\\main\\Resources\\issuers.csv");

        if (customFilePath != null) {
            path = customFilePath;
        }

        File issuers = new File (path);
        // metoda try-with-resources
        //      String resourcePath = getClass()
        //          .getClassLoader()
        //          .getResource("issuers.csv")
        //          .getPath();
        //         try (BufferedReader bufferedReader = new BufferedReader(new FileReader(resourcePath))) {
        //              String line;
        //              while ((line = bufferedReader.readLine()) != null) {
        //                  itd. jak poniżej.
        //
        //              } catch (FileNotFoundException e) {
        //                  e.printStackTrace();
        //              } catch (IOException e) {
        //                  e.printStackTrace();
        //              }
        //              return issuerRules;


        try {
            FileReader fileReader = new FileReader(issuers);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            boolean isFirstLine = false;

            while ((line = bufferedReader.readLine()) != null) {
                if (isFirstLine) {
                    String[] values = line.split(";");
                    issuerRules.add(new IssuerRule(values[0], values[1], Integer.parseInt(values[2])));
                } else {
                    isFirstLine = true;
                }
            }
        } catch (FileNotFoundException e) {
            throw new ListingNotFoundException("The file was not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return issuerRules;
    }
}
