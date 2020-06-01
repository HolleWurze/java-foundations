package oop.lombok.hwOopObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class wolfOfWallStreet {
    private String contactNumber;


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        wolfOfWallStreet that = (wolfOfWallStreet) o;

        return contactNumber != null ? contactNumber.equals(that.contactNumber) : that.contactNumber == null;
    }

    public int hashCode() {
        return contactNumber != null ? contactNumber.hashCode() : 0;
    }
}
