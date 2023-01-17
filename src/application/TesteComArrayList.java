package application;

import entities.ContaCorrente;

import java.util.ArrayList;

public class TesteComArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> list = new ArrayList<>(); // generics

        Conta cc = new ContaCorrente(22, 11);
        list.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        list.add(cc2);

        System.out.println("Tamanho: " + list.size());
        Conta ref = list.get(0);
        System.out.println(ref.getNumero());

        list.remove(0);

        Conta cc3 = new ContaCorrente(33, 112);
        list.add(cc3);

        Conta cc4 = new ContaCorrente(33, 222);
        list.add(cc4);

        System.out.println("Tamanho: " + list.size());

        System.out.println("Usando for normal");
        for (int i = 0; i < list.size(); i++) {
            Object oRef = list.get(i);
            System.out.println(oRef);
        }

        System.out.println("Usando for each");
        for (Conta conta : list) {
            System.out.println(conta);
        }
    }
}

