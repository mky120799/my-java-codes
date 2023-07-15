public class StringClasses {
     static void change(int A[],int index,int value)
    {
        A[index]=value;
    }
    public static void main(String [] args)
    {        int A[]={1,2,2,3,4};
        change(A,2,20);
        for(int x:A)
        {
            System.out.println(x);
        }

    }
}
