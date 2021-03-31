package Questão1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import Questão1.CupomFiscal.CupomBuilder;



public class Main {
    public static void main(String arsg[]) {

        Item i1 = new Item(001, "Forno Microondas", 355.0, 1);
        Item i2 = new Item(002, "Circulador de Ar",250.0,2);
        Item i3 = new Item(003,"Televisão 14", 475.0, 2);

        CupomFiscal c1 = new CupomFiscal.CupomBuilder("Loja de Tudo", "0000000000123456")
            .cnpjConsumidor("77788877788").dinheiroRecebido(300.0).build();
        
        c1.inserir(i1);

    }
}
