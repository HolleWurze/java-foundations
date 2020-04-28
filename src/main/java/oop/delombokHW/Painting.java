package oop.delombokHW;

public class Painting {
    private String authorOfPainting;
    private String eraOfCreation;

    public Painting(String authorOfPainting, String eraOfCreation) {
        this.authorOfPainting = authorOfPainting;
        this.eraOfCreation = eraOfCreation;
    }

    public String getAuthorOfPainting() {
        return authorOfPainting;
    }

    public void setAuthorOfPainting(String authorOfPainting) {
        this.authorOfPainting = authorOfPainting;
    }

    public String getEraOfCreation() {
        return eraOfCreation;
    }

    public void setEraOfCreation(String eraOfCreation) {
        this.eraOfCreation = eraOfCreation;
    }
}
