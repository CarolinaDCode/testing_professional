package academy.atl.refactorizacion;

import academy.atl.refactorizacion.JuegoAhorcado;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] palabras = {"programacion", "computadora", "java", "desarrollo", "tecnologia"};
        JuegoAhorcado juegoAhorcado = new JuegoAhorcado(6, palabras);

        juegoAhorcado.jugar();
    }
}