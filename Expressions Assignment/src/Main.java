public class Main {
    public static void main(String args[]){
        /*For the following expressions write out using code step by step how the
        compiler will evaluate it
        Example:
        System.out.println(2 * 5 + 3);
        System.out.println(10 + 3);
        System.out.println(13);
        Only complete one computation per line of code
        The output for every line is always equal to the same number
        In example above the out put should be
        13
        13
        13
        */

        //Expression 1
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);
        /* My Answer:
        System.out.println((5) + (5) - ((-4)/3));
        System.out.println( 5 + 5 - (-1.3*repeater*));
        System.out.println( 5 + 5 + 1.3*repeater*)
        System.out.println( 10 + 1.3*repeater*);
        System.out.println( 11.3*repeater or 34/3);
         */

        //Expression 2
        System.out.println(23%4 + (18 - 3 / 2));
        /* My Answer:
        System.out.println((Remainder = 3) + (18 - (1.5)));
        System.out.println((3) + (16.5));
        System.out.println(3 + 16.5);
        System.out.println(19.5);
         */

        //Expression 3
        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        /* My Answer:
        System.out.println((3) + ((81)/5));
        System.out.println( 3 + 16.2);
        System.out.println(19.2);
        */

        //Expression 4
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        /* My Answer:
        System.out.println((Remainder=1) - 8 + ((8)/8) + ((9)/3));
        System.out.println( 1 - 8 + 1 + 3);
        System.out.println(-3);
         */


        //Expression 5
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        /* My Answer:
        System.out.println(((7 + 3) * ( 0.850903524) + 2) - Math.pow(5,3));
        System.out.println(((10) * (2.850903524)) - 125);
        System.out.println(28.50903524 - 125);
        System.out.println(-96.49096476);
        */



        /*
        SIDE NOTES:
        ~Follow BEDMASS

        ~X%Y--> Gives you the remainder when dividing X by Y

        ~Math.sin(X)--> Using the sin symbole, it gives you the answer in radiant mode.
         */

    }
}
