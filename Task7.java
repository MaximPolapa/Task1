package Laboratorka1;

import static java.lang.System.out;


public class Task7 {

    public static void main(String[] arg){
        final PairProduct[] pairProducts = new PairProduct[]{
                new PairProduct(new Product("KYKYRYZA",1000),3),
                new PairProduct(new Product("SVYNA",3000),1),
                new PairProduct(new Product("SANYA",1000),1)
        };

    double endPrice = 0;
        out.println("Price list: ");
        for (PairProduct pairprod:pairProducts){
            out.println("Name: " + pairprod.getProduct().getName() + " "
                    + pairprod.getProduct().getPrice() + " grn "
                    + pairprod.getCount() + " counts ");
            endPrice += pairprod.getProduct().getPrice();
        }
        out.print(endPrice);


    }
}



