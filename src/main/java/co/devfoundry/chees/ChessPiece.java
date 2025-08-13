package co.devfoundry.chees;

public abstract class ChessPiece {
    protected String name;
    protected String numberPosition;
    protected String letterPosition;
    protected Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String colorName) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;

        switch (colorName.toLowerCase()) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            default:
                this.color = ColorRepository.getWhite();
                break;
        }
    }

    public Color getColor() {
        return color;
    }
}
