package co.devfoundry;

import co.devfoundry.chees.BlackPawn;
import co.devfoundry.chees.BlackQueen;
import co.devfoundry.chees.WhitePawn;
import co.devfoundry.chees.WhiteQueen;
import co.devfoundry.chees.CheesPiece;

public class Main {
    public static void main(String[] args) {

        CheesPiece blackPawn = new BlackPawn("Czarny Pionek","7", "a");
        CheesPiece whitePawn = new WhitePawn("Biały Pionek","2","a");
        CheesPiece blackQueen = new BlackQueen("Czarna Królowa");
        CheesPiece whiteQueen = new WhiteQueen("Biała Królowa");

        // exactly same color object is used
        System.out.println(blackPawn.getColor() == blackQueen.getColor());
        System.out.println(whitePawn.getColor() == whiteQueen.getColor());
    }
}