import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


//    The Array [p-p), ;p), :xX, 5op, ;~d, ;oD, 5-D, 4), pD, ;), :Pp, ;-x, ;D, :D, ;), (), (), :8X, ;)D, pd~D, 8pD, p), ;X, 8-), 5~D, 8-D, 5x2x, 5d), 8-2), p:~D, :2P]
//    has expected:<4> but was:<5>
//
//
//    The Array [;~d, 4~D, :D, 4), ;), ;p)d, ;-P, ;-d, (D, 5D, ;p, :D, 4~), 4~x, (), p8-p, 5p, 8-X, :), ;o), :D, ;X, 4D, ;d, (-), :), ;-X, 'P, oDp, ~;), '8d, (~X, ;-D), 8X, ;-p, po), od, :), :dP]
//    has expected:<7> but was:<8>
//
//
//    The Array [:-d, ;8D, ;D, 5~), ;8p, pD, pD, (), 8-), :), :p, 88), ;~D, ~82), 5~P), :p, 88D, 4x, ;-D, 4D, ;dD, ;~), odd, ~5p, -:~d, (8X, :-p, (), 4p2X, :dD, -42p]
//    has expected:<5> but was:<4>


    @Test
    public void test1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, Main.countSmileys(a));
    }

    @Test
    public void test2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, Main.countSmileys(a));
    }

    @Test
    public void test4() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, Main.countSmileys(a));
    }

    @Test
    public void test5() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, Main.countSmileys(a));
    }



    @Test
    public void test6() {
        List<String> a =  Arrays.asList("p-p)", ";p)", ":xX", "5op",
                ";~d", ";oD", "5-D", "4)", "pD", ";)", ":Pp", ";-x",
                ";D", ":D", ";)", "()", "()", ":8X", ";)D", "pd~D",
                "8pD", "p)", ";X", "8-)", "5~D", "8-D", "5x2x", "5d)",
                "8-2)", "p:~D", ":2P");
        assertEquals(4, Main.countSmileys(a));
    }


//    The Array [:X, oD, '-P, o;D, 4~D, :2pDD, '~d, 4xp, ;X, oD, :oD, ;-D, :x, :d, (xx, 85P, ;~), 4~P, o~D, :D, ;8), :o), ;~P, o(), ;), :D, oP, ;~), :D, ~;), :p), 5D), 4p, 8ox), -:), (-P, ;p), ;D, o-Px, ;P]
//    has expected:<8> but was:<7>
//
    @Test
    public void test7() {
        List<String> a =  Arrays.asList(":X", "oD'", "'-P", "o;D", "4~D", ":2pDD", "'~d", "4xp", ";X", "oD", ":oD",
                ";-D", ":x", ":d", "(xx", "85P",
                ";~)", "4~P", "o~D",
                ":D", ";8)", ":o)", ";~P", "o()",
                ";)",
                ":D", "oP",
                ";~)",
                ":D", "~;)", ":p)", "5D)", "4p", "8ox)", "-:)", "(-P", ";p)",
                ";D", "o-Px", ";P");
        assertEquals(8, Main.countSmileys(a));
    }



}
