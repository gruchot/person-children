package pl.gru.parent_children.model;

public enum AdultOrChild {
    ADULT('D'),
    CHILD('d');

    AdultOrChild(char marker) {
        this.marker = marker;
    }

    public char getMarker(){
        return this.marker;
    }

    private char marker;

}
