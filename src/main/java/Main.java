package co.devfoundry;

import co.devfoundry.chees.BlackPawn;
import co.devfoundry.chees.BlackQueen;
import co.devfoundry.chees.WhitePawn;
import co.devfoundry.chees.WhiteQueen;
import co.devfoundry.chees.ChessPiece;

public class Main {
    public static void main(String[] args) {

        ChessPiece blackPawn = new BlackPawn("Czarny Pionek","7", "a");
        ChessPiece whitePawn = new WhitePawn("Biały Pionek","2","a");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biała Królowa");

        // exactly same color object is used
        System.out.println(blackPawn.getColor() == blackQueen.getColor());
        System.out.println(whitePawn.getColor() == whiteQueen.getColor());
    }
}