package application;

import entities.ContaCorrente;

import java.util.LinkedList;

public class TesteComArrayList {
    public static void main(String[] args) {
        LinkedList<Conta> list = new LinkedList<>(); // generics

        Conta cc = new ContaCorrente(22, 11);
        list.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        list.add(cc2);

        boolean existe = list.contains(cc2);

        System.out.println("Já existe? " + existe);

        for (Conta conta : list) {
           if (conta.equals(cc2)) {
               System.out.println("Já existe!");
           }
        }

        System.out.println("Usando for each");
        for (Conta conta : list) {
            System.out.println(conta);
        }
    }
}

