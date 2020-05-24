package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        playTicTacToe();
    }

    static void playTicTacToe() {
        char[][] field = getField();
        drawField(field);

        char playerSign = 'X';
        char computerSign = 'O';
        char currentPlayerSign = playerSign;
        String currentPlayerName = "Player";

        boolean isWin;
        boolean draw;
        do {
            move(field, currentPlayerSign);
            drawField(field);
            isWin = checkWin(field, currentPlayerSign);
            draw = checkDraw(field);

            if (!isWin) {
                currentPlayerSign = currentPlayerSign == playerSign ? computerSign : playerSign;
                currentPlayerName = currentPlayerSign == playerSign ? "Player" : "Computer";

            }
        } while(!isWin && !draw);

        if(draw){
            System.out.println("Сожалеем, ничья");
        } else {
            System.out.println(String.format("Поздравляю %s!!! Вы выиграли", currentPlayerName));
        }

        drawField(field);
    }

    static boolean checkDraw(char[][] field){
        int y = 0;
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '-'){
                    y++;
                }
            }
        }
        if(y == 1) return true;
        return false;
    }

    static void move(char[][] field, char currentPlayerSign) {
        if (currentPlayerSign == 'X') movePlayerSign(field, currentPlayerSign);
        else moveComputer(field, currentPlayerSign);
    }

    static boolean checkWin(char[][] field, char currentPlayerSign) {
        if (checkHorizontalWin(field, currentPlayerSign)){ return true; }
        if (checkVerticalWin(field, currentPlayerSign)){ return true; }
        if (checkDiagonalWin(field, currentPlayerSign)){ return true; }
        return false;
    }

    static boolean checkHorizontalWin(char[][] field, char currentPlayerSing) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == currentPlayerSing && field[i][1] == currentPlayerSing && field[i][2] == currentPlayerSing) return true;
        }
        return false;
    }

    static boolean checkVerticalWin(char[][] field, char currentPlayerSing) {
        for (int i = 0; i < field.length; i++){
            if (field[0][i] == currentPlayerSing && field[1][i] == currentPlayerSing && field[2][i] == currentPlayerSing) return true;
        }
        return false;
    }

    static boolean checkDiagonalWin(char[][] field, char currentPlayerSing) {
        int j = 0, y = field.length;
        for (int i = 0; i < field.length; i++){

            if(field[i][i] == currentPlayerSing){ j++; }
            if (j == 3) return true;

            if(field[i][y-1] == currentPlayerSing){ y--; }
            if (y == 0) return true;
        }
        return false;
    }

    static void moveComputer(char[][] field, char computerSign) {
        int x;
        int y;
        System.out.println("Ход компьютера ...");
        Random random = new Random();

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellEmpty(field, x, y));


        System.out.println(String.format("Компьютер ввел координаты [%s, %s]", x + 1, y + 1));
        field[x][y] = computerSign;
    }

    static void movePlayerSign(char[][] field, char playerSign) {
        int x;
        int y;
        boolean isEmptyCell;

        do {
            boolean isCorrectCoordinates;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите координату по горизонтали [1, 2, 3]");
                x = scanner.nextInt() - 1;
                System.out.println("Введите координату по вертикали [1, 2, 3]");
                y = scanner.nextInt() - 1;

                isCorrectCoordinates = checkCoordinates(x, y);
                notifyIncorrectCoordinates(isCorrectCoordinates);
            } while (!isCorrectCoordinates);

            isEmptyCell = isCellEmpty(field, x, y);
            notifyOccupiedCell(isEmptyCell, x, y);
        } while (!isCellEmpty(field, x, y));

        field[x][y] = playerSign;
    }

    static boolean isCellEmpty(char[][] field, int x, int y) {
        return field[x][y] == '-';
    }

    static void notifyOccupiedCell(boolean isOccupied, int x, int y) {
        if (!isOccupied) {
            System.out.println(String.format("Введенные координаты некорректны. [%s, %s] координаты заняты", x, y));
        }
    }

    static void notifyIncorrectCoordinates(boolean isCorrect) {
        if (!isCorrect) {
            System.out.println("Введите корректные координаты. Координаты в диаппазоне [1, 2, 3]");
        }
    }

    static boolean checkCoordinates(int x, int y) {
        return (x >= 0 && x <= 2) && (y >= 0 && y <= 2);
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] getField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

}
