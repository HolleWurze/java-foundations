package oop.lombok.hwOopObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

public class Painting {
    private String authorOfPainting;
    private String eraOfCreation;

    @Override
    public String toString() {
        return authorOfPainting + " " + eraOfCreation;
    }
}
