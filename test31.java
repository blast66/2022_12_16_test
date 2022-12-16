import javax.imageio.plugins.tiff.FaxTIFFTagSet;

public class test31 {
    public static void main(String[] args){
        int[] a = {7, 5, 4, 8, 1, 2};
        int c = 0;

            for(int i = 0 ; i < a.length/2; i++){
                c = a[i] ;
                a[i] = a[(a.length-1)- i];
                a[(a.length-1)-i] = c ; 

            }
        
        for(int x = 0 ; x < a.length; x++){
            System.out.println(">>" + a[x] );
        }
    }
}