package Array;

public class CopyingAnArrayInJava {

    public static void main(String[] args) {
      int a[] = {12,21,0,5,7};//declaration and initializing an array
               int[] b =a;  //copying array a to array b

        for (int i =0;i<b.length;i++)
        {  System.out.println(b[i]);
        }
       a[2] = 56; //changing value of 3rd element of array a
        System.out.println(b[2]); //value of 3rd element of array b also changes
        b[4] =100; //changing the value 5th element of array b
        System.out.println(a[4]);//value of 5th element of array a also changes

        /*int [] a= {12,21,0,5,7};
        int[] b = new int[a.length];
        for (int i =0;i<a.length;i++)
        {
            b[i]=a[i];
            System.out.println(b[i]);
        }
        a[2]=45;
        System.out.println(b[2]);
        b[4]=100;
        System.out.println(a[4]);

      /* int[] a={12,21,0,5,7};

        Arrays Arrays;
        int[] b= Arrays.copyOf(a,a.length);

       for (int i =0;i<b.length;i++)
       {
           System.out.println(b[i]);
       }
       a[2] = 56;
        System.out.println(b[2]);

        int [] a= {12,21,2,5,7};
        int[] b= a.clone();

        for(int i =0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        a[2]=56;
        System.out.println(b[2]);*/

    }
}
