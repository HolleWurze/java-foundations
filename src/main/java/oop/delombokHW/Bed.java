package ru.itsjava.OOP;

public class Bed {
    private String treeFromWhichItIsMade;
    private String bedDimensions;

    public Bed(String treeFromWhichItIsMade, String bedDimensions) {
        this.treeFromWhichItIsMade = treeFromWhichItIsMade;
        this.bedDimensions = bedDimensions;
    }

    public String getTreeFromWhichItIsMade() {
        return treeFromWhichItIsMade;
    }

    public void setTreeFromWhichItIsMade(String treeFromWhichItIsMade) {
        this.treeFromWhichItIsMade = treeFromWhichItIsMade;

    }

    public String getBedDimensions() {
        return bedDimensions;
    }

    public void setBedDimensions(String bedDimensions) {
        this.bedDimensions = bedDimensions;

    }
}
