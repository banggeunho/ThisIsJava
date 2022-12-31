package api.string;

public class StringSplitExample {

    public static void main(String[] args) {

        String text = "방근호&신동재,김연수,이정명-방!근호";

        String[] names = text.split("&|,|-|!");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
