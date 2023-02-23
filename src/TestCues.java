// (c) Miquel Bofill

public class TestCues {
    // Descripció general: prova diferents implementacions de les cues
    //
    // Execució: java -ea TestCues

    public static void main(String[] args) {
        test(new TaulaCircular(4));
        test(new LlistaCircular(4));
    }

    private static void test(Cua c) {
        int i;
        System.out.print("Testing class " + c.getClass().getName() + "...");
        assert c.esBuida();
        c.encuar(1);
        assert !c.esBuida();
        assert !c.esPlena();
        c.encuar(2);
        c.encuar(3);
        c.encuar(4);
        assert c.esPlena();
        c.desencuar();
        assert !c.esPlena();
        c.encuar(1);
        assert c.esPlena();
        i = c.desencuar();
        assert i == 2: i;
        i = c.desencuar();
        assert i == 3 : i;
        i = c.desencuar();
        assert i == 4 : i;
        i = c.desencuar();
        assert i == 1 : i;
        assert c.esBuida();
        System.out.println("OK");
    }
    
}
