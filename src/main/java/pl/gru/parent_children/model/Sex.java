package pl.gru.parent_children.model;

public enum Sex {
    Male('M'),
    Female('F');

    public char getSex() {
        return sex;
    }

    private final char sex;
    Sex(char sex){
        this.sex = sex;
    }
}
