package Questão1;

import java.util.Arrays;

import Questão1.Item;

public class CupomFiscal {

    private String nomeLoja;
    private String cnpj;
    private String cpfConsumidor;
    private String cnpjConsumidor;
    private double dinheiroRecebido;
    private Item[] itens = new Item[100];

    private int posicaoCorrente = 0;

    private CupomFiscal(CupomBuilder builder) {
        this.nomeLoja = builder.nomeLoja;
        this.cnpj = builder.cnpj;
        this.cnpjConsumidor = builder.cnpjConsumidor;
        this.cpfConsumidor = builder.cpfConsumidor;
        this.dinheiroRecebido = builder.dinheiroRecebido;

    }

    public static class CupomBuilder {

        private String nomeLoja;
        private String cnpj;
        private String cpfConsumidor;
        private String cnpjConsumidor;
        private double dinheiroRecebido;

        public CupomBuilder(String nomeLoja, String cnpj) {
            this.nomeLoja = nomeLoja;
            this.cnpj = cnpj;
        }

        public CupomBuilder cpfConsumidor(String cpfConsumidor) {
            this.cpfConsumidor = cpfConsumidor;
            return this;
        }

        public CupomBuilder cnpjConsumidor(String cnpjConsumidor) {
            this.cnpjConsumidor = cnpjConsumidor;
            return this;
        }

        public CupomBuilder dinheiroRecebido(double dinheiroRecebido) {
            this.dinheiroRecebido = dinheiroRecebido;
            return this;
        }

        public CupomFiscal build() {
            return new CupomFiscal(this);
        }
    }

    public boolean inserir(Item i) {
        itens[posicaoCorrente] = i;
        posicaoCorrente++;
        return true;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCpfConsumidor() {
        return cpfConsumidor;
    }

    public String getCnpjConsumidor() {
        return cnpjConsumidor;
    }

    public double getDinheiroRecebido() {
        return dinheiroRecebido;
    }

    public Item[] getItens() {
        return itens;
    }

    public void imprimirItens(Item c[], int i, double soma) {
        System.out.println("" + c[i].getCodigo() + "  " + c[i].getNome() + "   " + c[i].getQtd() * c[i].getValorUnitario());
        soma += c[i].getQtd() * c[i].getValorUnitario();
    }

    public int getPosicaoCorrente() {
        return posicaoCorrente;
    }

    public int tamanho() {
        return itens.length;
    }
}
