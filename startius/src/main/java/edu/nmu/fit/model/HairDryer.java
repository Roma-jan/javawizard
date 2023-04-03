package edu.nmu.fit.model;

import jdk.jshell.execution.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v107.layertree.model.Layer;
import org.openqa.selenium.support.events.WebDriverListener;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;
public class HairDryer {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HairDryer hairDryer = (HairDryer) o;
        return price == hairDryer.price && Objects.equals(name, hairDryer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

