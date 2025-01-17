import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        System.out.println("Hello World!");
        assertEquals(2, 1 + 1);
    }

    @Test
    public void MarkdownParseTest() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");

        boolean actual = links.equals(expected);
        assertEquals(true, actual);
    }

    @Test
    public void MarkdownParseTest2() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");

        boolean actual = links.equals(expected);
        assertEquals(true, actual);
    }

    @Test
    public void MarkdownParseTest3() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();

        boolean actual = links.equals(expected);
        assertEquals(true, actual);
    }

    @Test
    public void MarkdownParseTest4() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();

        boolean actual = links.equals(expected);
        assertEquals(true, actual);
    }

    @Test
    public void MarkdownParseTest5() throws IOException {
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();

        boolean actual = links.equals(expected);
        assertEquals(true, actual);
    }

    @Test
    public void MarkdownParseTest6() throws IOException {
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();

        boolean actual = links.equals(expected);
        assertEquals(true, actual);
    }

    @Test
    public void MarkdownParseTest7() throws IOException {
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();

        boolean actual = links.equals(expected);
        assertEquals(true, actual);
    }

    @Test
    public void MarkdownParseTest8() throws IOException {
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();

        boolean actual = links.equals(expected);
        assertEquals(true, actual);
    }

    @Test
    public void MarkdownParseTest9() throws IOException {
        Path fileName = Path.of("test.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("page.com");

        boolean actual = links.equals(expected);
        assertEquals(true, actual);
    }

    @Test
    public void testSnippet1() throws IOException{
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("url.com");
        expectedList.add("google.com");
        expectedList.add("google.com");
        expectedList.add("ucsd.edu");
        assertEquals(expectedList,MarkdownParse.getLinks("labreport4snippet1.md"));
    }

    @Test
    public void testSnippet2() throws IOException{
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("a.com");
        expectedList.add("b.com");
        expectedList.add("example.com");
        assertEquals(expectedList,MarkdownParse.getLinks("labreport4snippet2.md"));
    }

    @Test
    public void testSnippet3() throws IOException{
        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("https://www.twitter.com");
        expectedList.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        expectedList.add("github.com");
        expectedList.add("https://cse.ucsd.edu/");
        assertEquals(expectedList,MarkdownParse.getLinks("labreport4snippet3.md"));
    }
}