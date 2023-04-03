package edu.nmu.fit;

import org.openqa.selenium.WebElement;

import javax.naming.CompoundName;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        SeleniumManager seleniumManager = new SeleniumManager();
        List<WebElement> webElements = seleniumManager.getHairDryers();

        int a = 1;
    }

    String getName(WebElement webElement) {
        return "";
    }

    int getPrice(WebElement webElement) {
        return 0;
    }

//        ReadWriter readWriter = new ReadWriter();
//        List<String> ListOfNames = readWriter.getDataFromFile();
//        List<String> transformedListOfNames = ListOfNames.stream().
//                map(it -> it = "Mr. " + it).
//                collect(Collectors.toList());
//        readWriter.pushDataToFile(transformedListOfNames);