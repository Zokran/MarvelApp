package hr.zokran.marveleapp.data.model.base;


import java.util.List;

import hr.zokran.marveleapp.data.model.Item;

/**
 * Reusing this in returning lists for events, stories, comics, series
 */
public class BaseList {
    private int available;
    private int returned;
    private String collectionURI;
    private List<Item> items;

    public int getAvailable() {
        return available;
    }

    public int getReturned() {
        return returned;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public List<Item> getItems() {
        return items;
    }
}
