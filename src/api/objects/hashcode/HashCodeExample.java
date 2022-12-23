package api.objects.hashcode;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HashCodeExample {
    public static void main(String[] args) {

        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        System.out.println(s1.hashCode());
        System.out.println(Objects.hashCode(s2));


    }

    static class Student {
        int sno;
        String name;
        Student (int sno, String name) {
            this.sno = sno;
            this.name = name;
        }

        /**
         * Generates a hash code for a sequence of input values. The hash
         * code is generated as if all the input values were placed into an
         * array, and that array were hashed by calling {@link
         * Arrays#hashCode(Object[])}.
         *
         * <p>This method is useful for implementing {@link
         * Object#hashCode()} on objects containing multiple fields. For
         * example, if an object that has three fields, {@code x}, {@code
         * y}, and {@code z}, one could write:
         *
         * <blockquote><pre>
         * &#064;Override public int hashCode() {
         *     return Objects.hash(x, y, z);
         * }
         * </pre></blockquote>
         *
         * <b>Warning: When a single object reference is supplied, the returned
         * value does not equal the hash code of that object reference.</b> This
         * value can be computed by calling {@link #hashCode(Object)}.
         *
         * @param values the values to be hashed
         * @return a hash value of the sequence of input values
         * @see Arrays#hashCode(Object[])
         * @see List#hashCode
         */
//        public static int hash(Object... values) {
//            return Arrays.hashCode(values);
//        }

        @Override
        public int hashCode() {
            return Objects.hash(sno, name);
        }
    }


}
