package arrays;

public class ElementOfEvenPosition {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};

        for(int i=0; i<a.length; i++)
        {
            if(i%2==0)
                System.out.println("Element of Even Position: "+a[i]);
        }
    }
}
