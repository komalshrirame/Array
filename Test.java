package Array;

public class Test {
    public static void main(String[] args) {
        int arr[] = new int[6];

        arr[0]=1;
        arr[1]=3;
        arr[2]=4;
        arr[3]=7;
        arr[4]=9;
        arr[5]=6;

        int sum =0;
        double marks=0;

        for (int i =0;i<6;i++)
            sum = sum + arr[i];
            marks = (double) sum / 6;

            System.out.println("sum of six numbers:" +sum);
            System.out.println("marks of six studebnt :" +marks);





    }
}
