package com.example.remoteapisaugust;

public class MovieResponse {

    private int budget;

    private String original_title;

    private String tagline;

    String revenue_total;

    public MovieResponse() {
    }

    public MovieResponse(int budget, String original_title, String tagline, String revenue_total) {
        this.budget = budget;
        this.original_title = original_title;
        this.tagline = tagline;
        this.revenue_total = revenue_total;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getRevenue_total() {
        return revenue_total;
    }

    public void setRevenue_total(String revenue_total) {
        this.revenue_total = revenue_total;
    }
}
