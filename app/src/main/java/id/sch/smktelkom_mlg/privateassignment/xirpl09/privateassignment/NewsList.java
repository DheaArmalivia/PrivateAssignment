package id.sch.smktelkom_mlg.privateassignment.xirpl09.privateassignment;

import java.io.Serializable;

/**
 * Created by Smktelkom on 13/05/2017.
 */

public class NewsList implements Serializable {
    private String image;
    private String judul;
    private String popular;

    public NewsList(String image, String judul, String popular) {
        this.image = image;
        this.judul = judul;
        this.popular = popular;
    }

    public String getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getPopular() {
        return popular;
    }

}
