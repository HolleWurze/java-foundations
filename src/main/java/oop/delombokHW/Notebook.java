package oop.delombokHW;

public class Notebook {
    private String modelNotebook;
    private String screenDiagonal;

    public Notebook(String modelNotebook, String screenDiagonal) {
        this.modelNotebook = modelNotebook;
        this.screenDiagonal = screenDiagonal;
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
