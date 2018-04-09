public class RelLogOps {

    public static void main(String[] args) {
        int i, j;
        boolean p, q, PandQ, PorQ, PQ, notP;

        i=10;
        j=11;
        if(i<j) System.out.println("i<j");
        if(i<=j) System.out.println("i<=j");
        if(i!=j) System.out.println("i!=j");
        if(i==j) System.out.println("never");
        if (i>=j) System.out.println("never");
        if(i>j) System.out.println("i>j");

        p = false;
        q = false;
        System.out.println("P&Q\t\tP|Q\t\tP^Q\t\t!P");
        System.out.println("***************************");
        if (PandQ = p&q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (PorQ = p|q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (PQ = p^q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (notP=!p) System.out.println(true + "|\t"); else System.out.println(false + "|\t");

        p = true;
        q = false;
        if (PandQ = p&q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (PorQ = p|q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (PQ = p^q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (notP=!p) System.out.println(true + "|\t"); else System.out.println(false + "|\t");

        p = false;
        q = true;
        if (PandQ = p&q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (PorQ = p|q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (PQ = p^q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (notP=!p)System.out.println(true + "|\t"); else System.out.println(false + "|\t");

        p = true;
        q = true;
        if (PandQ = p&q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (PorQ = p|q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (PQ = p^q) System.out.print(true + "|\t"); else System.out.print(false + "|\t");
        if (notP=!p)System.out.println(true + "|\t"); else System.out.println(false + "|\t");


    }
}
