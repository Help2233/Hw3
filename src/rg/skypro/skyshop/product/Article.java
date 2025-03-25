package rg.skypro.skyshop.product;

import rg.skypro.skyshop.Searchable;

public final class Article implements Searchable {

    private final String articleTitle;
    private final String textArticle;

    public Article(String articleTitle, String textArticle) {
        this.articleTitle = articleTitle;
        this.textArticle = textArticle;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getTextArticle() {
        return textArticle;
    }

    @Override
    public String toString() {
        return "Название: " + articleTitle +
                " Описание: " + textArticle;
    }

    @Override
    public String searchTerm() {
        return toString();
    }

    @Override
    public String typeContent() {
        return "ARTICLE";
    }

    @Override
    public void getStringRepresentation() {
        Searchable.super.getStringRepresentation();
    }
}