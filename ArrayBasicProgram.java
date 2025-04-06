package Array;

public class ArrayBasicProgram {
    public static void main(String[] args) {

    int num[] = {10,20,30,40,50};
        System.out.println("original array");

        System.out.println("3rd index :" + num[3]);
        num[0]=66;
        System.out.println("update oth index :" +num[0]);
        int sum =0;


        for (int i =0;i<num.length;i++) {
            System.out.println(num[i]);
            sum += num[i]/4;

        }
        System.out.println("sum of all num :" + sum);

    }}
