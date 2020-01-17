package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("unai emery")) {
            return "Unai Emery is a spanish fraud who killed my beautiful club. Unai played at Luqito Torreira at CAM ffs";
        }
        return "";
    }
}
