package com.springmvcdemo;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;

    private String favoriteLanguage;
    private String[] operatingSystems;
    private LinkedHashMap<String, String> countryOptions;

    public Student(){
        // Populate country options : used ISO country code
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("Ind","India");
        countryOptions.put("Pak","Pakistan");
        countryOptions.put("USA","America");
        countryOptions.put("JP","Japan");
        countryOptions.put("Chi","China");
        countryOptions.put("BR","Brazil");
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
