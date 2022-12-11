package DataType;

public class ArrayCopyByForExample {
    public static void main ( String[] args) {

        int[] oldIntArray = {1, 2, 3};
        int[] newIntArray = new int[5];

        for (int i = 0; i < oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }

        for (int i = 0; i< oldIntArray.length; i ++) {
            System.out.println(newIntArray[i]);
        }

        // System.arraycopy(Object src, int srcPos, Object des, int destPos, int length);

        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for ( String value: newStrArray) {
            System.out.println(value);
        }

    }
}
