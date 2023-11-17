package br.com.inatel;

import br.com.inatel.views.Menus;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Menus menu = new Menus();
        menu.inicial();
        sc.close();
    }
}