import java.util.List;
import java.util.function.Predicate;

public class Main {


    static Predicate<String> con1 = i -> i.equals(":)");
    static Predicate<String> con2 = i -> i.equals(";)");
    static Predicate<String> con5 = i -> i.equals(":D");
    static Predicate<String> con6 = i -> i.equals(";D");
    static Predicate<String> con3 = i -> i.equals(":-)");
    static Predicate<String> con4 = i -> i.equals(";-)");
    static Predicate<String> con7 = i -> i.equals(":-D");
    static Predicate<String> con12 = i -> i.equals(";-D");
    static Predicate<String> con8 = i -> i.equals(":~D");
    static Predicate<String> con9 = i -> i.equals(";~D");
    static Predicate<String> con10 = i -> i.equals(":~)");
    static Predicate<String> con11 = i -> i.equals(";~)");


    public static int countSmileys(List<String> arr) {

        return (int) arr.stream()
                .filter(n->n.length()<4)
                .filter( con1.or(con2)
                        .or(con3)
                        .or(con4)
                        .or(con5)
                        .or(con6)
                        .or(con7)
                        .or(con8)
                        .or(con9)
                        .or(con10)
                        .or(con12)
                        .or(con11)).count();
    }



//    public static int countSmileys(List<String> arr) {
//        return (int) arr.stream()
//                .filter(x -> x.matches("[:;][~-]?[)D]"))
//                .count();
//    }



}
