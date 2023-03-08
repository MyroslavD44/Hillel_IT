package dz9;


public enum Size {
    S("S", 20, 30),
    M("M", 25, 35),
    XL("XL", 35, 45);

    private String abbreviation;
    private int width;
    private int length;

    String getAbbreviation() {
        return abbreviation;
    }

    int getWidth() {
        return width;
    }

    int getLength() {
        return length;
    }

    Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }
}


