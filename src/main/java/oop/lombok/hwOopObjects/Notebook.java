package oop.lombok.hwOopObjects;

public class Notebook {
    private String modelNotebook;
    private String screenDiagonal;

    public Notebook(String modelNotebook, String screenDiagonal) {
        this.modelNotebook = modelNotebook;
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public String toString() {
        return modelNotebook + " " + screenDiagonal;
    }

    public String getModelNotebook() {
        return modelNotebook;
    }

    public void setModelNotebook(String modelNotebook) {
        this.modelNotebook = modelNotebook;
    }

    public String getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(String screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }
}
