package Questão1;


import Questão1.Item;

public class Impressora {

    private static Impressora instance = new Impressora();

    private Impressora() {

    }
    public static Impressora getInstance() {
        return instance;
    }

    public void imprimir(CupomFiscal c) {
        double soma=0;
        System.out.print("   "+c.getNomeLoja());
        System.out.println("CNPJ: "+c.getCnpjConsumidor());
        System.out.println("--------------------------");
        System.out.println("CPF/CNPJ consumidor: "+c.getCnpjConsumidor()+""+c.getCpfConsumidor());
        for(int i=0; i<c.tamanho();i++){
            c.imprimirItens(c.getItens(), i, soma);
        }
        System.out.println("Total:       R$"+soma);
        System.out.println("Valor recebido:    R$"+c.getDinheiroRecebido());
        //System.out.println("Troco:      R$"+ soma - c.getDinheiroRecebido());
    }
}
