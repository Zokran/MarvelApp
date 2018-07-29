package hr.zokran.marveleapp.data.model.character;


import java.util.Date;
import java.util.List;

import hr.zokran.marveleapp.data.model.Thumbnail;
import hr.zokran.marveleapp.data.model.URL;
import hr.zokran.marveleapp.data.model.base.BaseList;

public class Character {
    private int Id;
    private String name;
    private String description;
    private Date modified;
    private String resourceURI;
    private List<URL> urls;
    private Thumbnail thumbnail;
    private List<BaseList> comics;
    private List<BaseList> stories;
    private List<BaseList> events;
    private List<BaseList> series;

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getModified() {
        return modified;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public List<URL> getUrls() {
        return urls;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public List<BaseList> getComics() {
        return comics;
    }

    public List<BaseList> getStories() {
        return stories;
    }

    public List<BaseList> getEvents() {
        return events;
    }

    public List<BaseList> getSeries() {
        return series;
    }
}
