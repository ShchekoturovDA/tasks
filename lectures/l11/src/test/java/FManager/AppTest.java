package FManager;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.tasks.FileWork;
import org.tasks.IOManager;
import org.tasks.NIOManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void TestIOCreate() throws IOException {
        IOManager io = new IOManager();
        io.MakeFile("test1.txt");
        assertTrue(Files.exists(Path.of("test1.txt")));
    };

    @Test
    public void TestIOWriteFile() throws IOException {
        IOManager io = new IOManager();
        String nf = "t2.txt";
        io.MakeFile(nf);
        io.WriteFile(nf, nf);
        String ch = Files.readAllLines(Path.of(nf)).toString();
        String need = "[" + nf + "]";
        assertEquals(need, ch);
    };

    @Test
    public void TestIOReadFile() throws IOException {
        IOManager io = new IOManager();
        String nf = "t3.txt";
        io.MakeFile(nf);
        io.WriteFile(nf, nf);
        String ch = io.ReadFile(nf);
        assertEquals(nf, ch);
    };

    @Test
    public void TestNIOCreate() throws IOException {
        NIOManager nio = new NIOManager();
        nio.MakeFile("testnio1.txt");
        assertTrue(Files.exists(Path.of("testnio1.txt")));
    };

    @Test
    public void TestNIOWriteFile() throws IOException {
        NIOManager nio = new NIOManager();
        String nf = "tnio2.txt";
        nio.MakeFile(nf);
        nio.WriteFile(nf, nf);
        String ch = Files.readAllLines(Path.of(nf)).toString();
        String need = "[" + nf + "]";
        assertEquals(need, ch);
    };

    @Test
    public void TestNIOReadFile() throws IOException {
        NIOManager nio = new NIOManager();
        String nf = "tnio3.txt";
        nio.MakeFile(nf);
        nio.WriteFile(nf, nf);
        String ch = nio.ReadFile(nf);
        assertEquals(nf, ch);
    };


}