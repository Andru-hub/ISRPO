package com.company;
public class Main
{

    public static void main(String[] args)
    {


        String nums[];
        int i = -1;
        String y ;
        int j ;
        nums = new String [ 1 ];

        nums = Put("1",nums ,i = in(i)) ;

        nums = Put("3",nums ,i = in(i)) ;

        nums = Put("5",nums ,i = in(i)) ;

        nums = Put("6",nums ,i = in(i)) ;

        nums = Put("11",nums ,i = in(i)) ;

        nums = Put("5",nums ,i = in(i)) ;



        nums = Put("6",nums ,i = in(i)) ;



        nums = Put("999",nums ,i = in(i)) ;



        nums = Put("66",nums ,i = in(i)) ;

        System.out.println("---------------------- Ввод данны  ---------------------------------");
        y = Get(nums) ; nums = Gets(nums) ;
        System.out.println(y);

        y = Get(nums) ; nums = Gets(nums) ;
        System.out.println(y);

        y = Get(nums) ; nums = Gets(nums) ;
        System.out.println(y);

        System.out.println("---------------------- доставание из очереди  ----------------------");

        nums = AllGets(nums);

        System.out.println("----------------- Очистка масива от пустых полей  ------------------");


        int R[] = new int [ nums.length   ];

        for ( j = 0; j < nums.length ; j++)
        {

            R[j] = Integer.parseInt (nums[j]) ;
        }
        R = insertionSortImperative(R);

        for ( j = 0; j < R.length ; j++){
            System.out.println(R[j]);
        }
        System.out.println("------------ Работа сортировки  -----------");

        String c[] = new String [ 2 ];
        int max = 0 , min = 40 ;
        double a ;
        String m ;
        for (j = 0; j < 10 ; j++)
        {
            a =  Math.random()*40;
            m = (int)a + "";
            if ( a > max ){
                max = j ;
            }
            if ( a < min ){
                min = j ;
            }

            c = Put(m,c,j) ;
        }

        String s ;
        s = c[max] ;
        c[max] = c[min] ;
        c[min] = s ;

        System.out.println("------------ Ввывод финального масива -----------");
        for (j = 0; j < 10 ; j++){
            System.out.println(c[j]);
        }

    }


    static String[] Put ( String x,String y[] , int i)
    {
        if (y.length  <= i  )
        {


            String  stroka[] = new String [y.length * 2 ];

            for (int j = 0; j < y.length; j++){
                stroka[j] = y[j];
            }
            y = stroka;
        }

        y[i] = x ;
        return  y ;
    }
    static int in (int x )
    {
        x++ ;
        return x ;
    }

    static String Get (String y[] )
    {
        return y[0] ;
    }


    static String[] Gets (String y[] )
    {
        for (int j = 1; j < y.length ; j++)
        {
            y[j - 1] = y[j];
        }
        y[y.length - 1] = null ;
        return y ;
    }
    static String[] AllGets (String y[] )
    {
        int k = 0 ;
        for (int i = 0 ; i < y.length; i++)
        {
            if (y[i] == null )
            {
                k++;
            }
        }
        String  stroka[] = new String [ (y.length - k) ];

        for (int j = 0; j < stroka.length; j++){
            stroka[j] = y[j];
        }
        return stroka;
    }

    public static int[] insertionSortImperative(int[] mass)
    {
        for (int i = 1; i < mass.length; i++)
        {
            int key = mass[i];
            int j = i - 1;
            while (j >= 0 && mass[j]> key)
            {
                mass[j + 1]= mass[j];
                j = j - 1;
            }
            mass[j + 1]= key;
        }

        return mass;
    }
}