import javax.imageio.plugins.tiff.FaxTIFFTagSet;

public class test31 {
    public static void main(String[] args){
        int[] a = {7, 5, 4, 8, 1, 2};
        int c = 0;
        if(a.length%2 == 0){
            for(int i = 0 ; i < a.length; i++){
                c = a[i];
                a[i] = a[a.length-i];
                a[a.length-i] = a[c];
            }
        }
        for(int x = 0 ; x < a.length; x++){
            System.out.println(">>" + a[x] );
        }
    }
}