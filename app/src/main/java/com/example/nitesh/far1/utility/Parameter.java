package com.example.nitesh.far1.utility;

/**
 * Created by nitesh on 8/7/17.
 */

public class Parameter {

    private int id;
    private int albumid;
    private String title;
    private String url;
    private String thumbnail;

    public Parameter(int id, int albumid, String title, String url, String thumbnail) {
        this.id = id;
        this.albumid = albumid;
        this.title = title;
        this.url = url;
        this.thumbnail = thumbnail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlbumid() {
        return albumid;
    }

    public void setAlbumid(int albumid) {
        this.albumid = albumid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
