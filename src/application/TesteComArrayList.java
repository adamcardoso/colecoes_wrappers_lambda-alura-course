package application;

import entities.ContaCorrente;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TesteComArrayList {
    public static void main(String[] args) {
        List<Conta> list = new Vector<>(); // generics

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

