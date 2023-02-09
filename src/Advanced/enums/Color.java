package Advanced.enums;

public enum Color {
    //Enumerators are static, like seasons, colors
    RED("red"), GREEN("green"), BLUE("blue");

    private String value;

    Color (String value) {
        this.value = value;
    }

    public  String getValue() {
        return value;
    }
}
