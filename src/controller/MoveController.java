package controller;

import model.Cell;
import model.CellStatus;
import model.Game;

public class MoveController {

    private static int countOfOpenCells;

    public static void makeMove(Game game, Cell cell) {
        switch (countOfOpenCells) {
            case 0:
                CellStatusController.swap(cell);
                countOfOpenCells = 1;
                break;
            case 1:
                CellStatusController.swap(cell);
                checkCells(game);
                countOfOpenCells = 0;
                break;
        }

    }

    private static void checkCells(Game game) {
        Cell[][] cells = game.getField().getCells();
        Cell c1 = null;
        Cell c2 = null;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                if(cells[i][j].getStatus() == CellStatus.OPENED){
                    if(c1 == null){
                        c1 = cells[i][j];
                    } else {
                        c2 = cells[i][j];
                    }
                }
            }
        }
        if(c1 == null || c2 == null){

        } else {
            int v1 = c1.getValue();
            int v2 = c2.getValue();

            // todo: Подождать одну секунду и сделать следующий шаг
            if(v1 == v2){
                CellStatusController.makeInaktive(c1);
                CellStatusController.makeInaktive(c2);
            } else{
                CellStatusController.swap(c1);
                CellStatusController.swap(c2);
            }
        }
    }

}
