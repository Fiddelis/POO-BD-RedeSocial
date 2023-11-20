package br.com.inatel;

import br.com.inatel.views.TelaInicial;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TelaInicial telaInicial = new TelaInicial();

        telaInicial.exibir();

        sc.close();
    }
}