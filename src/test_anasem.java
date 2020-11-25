import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class test_anasem {
    public static void main(String[] args) throws Exception{
        CharStream input = CharStreams.fromFileName(args[0]);
        Analex analex = new Analex(input);
        CommonTokenStream tokens = new CommonTokenStream(analex);
        Anasint anasint = new Anasint(tokens);
        ParseTree tree = anasint.programa();

        //Recorrer arbol con listener
        ParseTreeWalker walker = new ParseTreeWalker();
        Anasem_listener anasemListener = new Anasem_listener();
        walker.walk(anasemListener,tree);

        //Recorrer arbol con Visitor
        //Anasem_visitor anasemVisitor = new Anasem_visitor();
        //anasemVisitor.visit(tree);

        System.out.println("=========   MAIN   ===========");
        System.out.println("Almacén de variables declaradas\n"+anasemListener.getAlmacen_variables_declaradas());
        System.out.println("Almcaén de subprogramas\n"+anasemListener.getAlmacen_subprogramas());


    }
}
