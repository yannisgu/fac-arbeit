import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

import com.google.common.base.Objects;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java_cup.runtime.Symbol;

import ch.ffhs.ti.umk.skript.instr.Evaluator;
import ch.ffhs.ti.umk.skript.instr.Instruction;
import ch.ffhs.ti.umk.skript.instr.Validator;
import ch.ffhs.ti.umk.skript.parser.parser;
import ch.ffhs.ti.umk.skript.parser.Scanner;

public class SkriptTest {

    @Test
    public void testIf() throws Exception {
        runTest("./src/test/data/testIf", new BigInteger("28"));
    }

    @Test
    public void testWhile() throws Exception {
        runTest("./src/test/data/testWhile", new BigInteger("20"));
    }


    @Test
    public void testFunction() throws Exception {
        runTest("./src/test/data/testFunction", new BigInteger("2"));
    }

    public void runTest(String file, BigInteger expectedOutput) throws Exception {
        Map<String, Object> context = new HashMap<String, Object>();
        String script = SkriptTest.readFile(file, Charset.defaultCharset());

        parser parser = new parser(new Scanner(new StringReader(script)));
        Symbol symbol = parser.parse();
        Instruction instr = (Instruction) symbol.value;
        Validator validator = new Validator();
        instr.acceptVisitor(validator);
        if (!validator.getUnusedVariables().isEmpty()) {
            System.out.println("Warning: Unused variables: " + validator.getUnusedVariables().toString());
        }
        if (!validator.getUndefinedVariables().isEmpty()) {
            System.out.println("Error: Undefined variables: " + validator.getUndefinedVariables().toString());
        } else {
            Evaluator evaluator = new Evaluator(context);
            BigInteger result = instr.acceptVisitor(evaluator);
            assertThat(result).isEqualTo(expectedOutput);
        }
    }

    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

}
