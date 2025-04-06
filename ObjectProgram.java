package Array;
 /*class demo1{
   int i ;
    void methodone()
    {
        System.out.println("from user defined type object");
    }
}
public class ObjectProgram {

    public static void main(String[] args) {
        demo1 [] de = new demo1[10];
        for (int i=0;i<de.length;i++)
        {
            de[i] = new demo1();
        }
        de[1].methodone();*/


    class A{
        int a;
        void methodone(){
            System.out.println("from class A");
        }
    }
    class B extends A{
        @Override
        void methodone() {

            System.out.println("from class B");

        }
    }
    public class ObjectProgram{
        public static void main(String[] args) {
            A[] a = new A[5];
            for(int i=0;i<a.length;i++)
            {
                a[i]=new B();
                a[i].methodone();
            }
        }
    }

