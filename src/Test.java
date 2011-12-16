import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: matt
 * Date: 11-12-16
 * Time: 3:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    
    public static void main(String[] args)
    {
        try {
            FileInputStream inputFile = new FileInputStream("untitled.csv");
            ANTLRInputStream input = new ANTLRInputStream( inputFile );
            LogicLexer lexer = new LogicLexer( input );
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LogicParser parser = new LogicParser(tokens);
            parser.spi_file();
            parser.miso.size();

        } catch (FileNotFoundException e) {
            System.out.println("Can't open file.");
        } catch (IOException e) {
            System.out.println("ANTLR exception.");
        } catch (RecognitionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


}
