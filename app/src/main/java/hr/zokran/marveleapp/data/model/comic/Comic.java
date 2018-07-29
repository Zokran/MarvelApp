package hr.zokran.marveleapp.data.model.comic;


import java.util.List;

import hr.zokran.marveleapp.data.model.Date;
import hr.zokran.marveleapp.data.model.Image;
import hr.zokran.marveleapp.data.model.Price;
import hr.zokran.marveleapp.data.model.Summary;
import hr.zokran.marveleapp.data.model.Thumbnail;
import hr.zokran.marveleapp.data.model.URL;
import hr.zokran.marveleapp.data.model.base.BaseList;

public class Comic {

    private int id;
    private int digitalId;
    private String title;
    private double issueNumber;
    private String variantDescription;
    private String description;
    private java.util.Date modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;

    private String issn;
    private String format;
    private int pageCount;
    private List<TextObjects> textObjects;
    private String resourceURI;
    private List<URL> urls;
    private List<Summary> series;
    private List<Summary> variants;
    private List<Summary> collections;
    private List<Summary> collectedIssues;
    private List<Date> dates;
    private List<Price> prices;
    private Thumbnail thumbnail;
    private List<Image> images;
    private BaseList creators;
    private BaseList characters;
    private BaseList stories;
    private BaseList events;

    public int getId() {
        return id;
    }

    public int getDigitalId() {
        return digitalId;
    }

    public String getTitle() {
        return title;
    }

    public double getIssueNumber() {
        return issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public String getDescription() {
        return description;
    }

    public java.util.Date getModified() {
        return modified;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getUpc() {
        return upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public String getIssn() {
        return issn;
    }

    public String getFormat() {
        return format;
    }

    public int getPageCount() {
        return pageCount;
    }

    public List<TextObjects> getTextObjects() {
        return textObjects;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public List<URL> getUrls() {
        return urls;
    }

    public List<Summary> getSeries() {
        return series;
    }

    public List<Summary> getVariants() {
        return variants;
    }

    public List<Summary> getCollections() {
        return collections;
    }

    public List<Summary> getCollectedIssues() {
        return collectedIssues;
    }

    public List<Date> getDates() {
        return dates;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public List<Image> getImages() {
        return images;
    }

    public BaseList getCreators() {
        return creators;
    }

    public BaseList getCharacters() {
        return characters;
    }

    public BaseList getStories() {
        return stories;
    }

    public BaseList getEvents() {
        return events;
    }
}
