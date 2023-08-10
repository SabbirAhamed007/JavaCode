package com.company;

import java.text.NumberFormat;

public class FormattingNUmberss {

    public static void main(String[] args){

        NumberFormat currencys = NumberFormat.getCurrencyInstance();
        String result = currencys.format(434.3242);
        System.out.println(result);


        NumberFormat payType = NumberFormat.getCurrencyInstance();
        String represent = payType.format(456.345);
        System.out.println(represent);


        NumberFormat tt = NumberFormat.getCurrencyInstance();
        String gg = tt.format(534353.534543);
        System.out.println(gg);

        NumberFormat ght = NumberFormat.getCurrencyInstance();
        String nty = ght.format(43432432432432424.43243324);

        System.out.println(nty);


        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String ttt = numberFormat.format(42432.343);
        System.out.println(ttt);

        NumberFormat instance1 = NumberFormat.getCurrencyInstance();
        String ff = instance1.format(4342332432423.42343);
        System.out.println(ff);


        NumberFormat instance = NumberFormat.getPercentInstance();
        String ghty = instance.format(.01);
        System.out.println(ghty);

        NumberFormat numberFormat1 = NumberFormat.getPercentInstance();
        String format = numberFormat1.format(.50);
        System.out.println(format);


        String result50 = NumberFormat.getPercentInstance().format(.34);
        System.out.println(result50);


        String valu = NumberFormat.getPercentInstance().format(.2);
        System.out.println(valu);

        String nnn = NumberFormat.getPercentInstance().format(.45);
        System.out.println(nnn);


        NumberFormat curre = NumberFormat.getCurrencyInstance();
        String ggg = curre.format(4443.4234);
        System.out.println(ggg);


        NumberFormat tyt = NumberFormat.getCurrencyInstance();
        String ppi = tyt.format(2434324654.423424);
        System.out.println(ppi);


        String re = NumberFormat.getPercentInstance().format(.42423);
        System.out.println(re);

        String typ = NumberFormat.getCurrencyInstance().format(4234423.423423432);
        System.out.println(typ);


    }
}
