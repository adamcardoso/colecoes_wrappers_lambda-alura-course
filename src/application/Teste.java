package application;

import entities.ContaCorrente;
import entities.GuardadorDeContas;

public class Teste {

    public static void main(String[] args) {
        GuardadorDeContas guardadorDeContas = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 11);
        guardadorDeContas.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardadorDeContas.adiciona(cc2);

        int tamanho = guardadorDeContas.getQuantidadeDeElementos();
        System.out.println("Existem "+tamanho+" contas");

        Conta ref = guardadorDeContas.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}
