package Questão1;

import java.util.Date;

public class Item {
	private int codigo;
	private String nome;
	private double valorUnitario;
	private int qtd;
	
	public Item(){}

	public Item(int codigo,String nome,double valorUnitario, int qtd) {
            this.codigo = codigo;
            this.nome = nome;
            this.valorUnitario = valorUnitario;
            this.qtd = qtd;
	}
	
	public int getCodigo() {
            return codigo;
	}
        
	public void setCodigo(int codigo) {
            this.codigo = codigo;
	}
        
	public String getNome() {
            return nome;
	}
        
	public void setNome(String nome) {
            this.nome = nome;
	}
        
	public double getValorUnitario() {
            return valorUnitario;
	}
        
	public void setValorUnitario(double valorUnitario) {
            this.valorUnitario = valorUnitario;
	}
        
	public int getQtd() {
            return qtd;
	}
        
	public void setQtd(int qtd) {
            this.qtd = qtd;
	}

	@Override
	public String toString() {
            return "Item [codigo=" + codigo + ", nome=" + nome + ", valorUnitario=" + valorUnitario + ", qtd=" + qtd + "]";
	}
	
	
	
}
