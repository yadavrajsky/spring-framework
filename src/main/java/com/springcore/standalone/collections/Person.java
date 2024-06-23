package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String, Integer> fees;
    Properties properties;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFees() {
        return fees;
    }

    public void setFees(Map<String, Integer> fees) {
        this.fees = fees;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person [fees=" + fees + ", friends=" + friends + "]" + "Properties: " + properties;
    }
}
