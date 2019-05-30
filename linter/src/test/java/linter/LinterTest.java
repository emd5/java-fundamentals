package linter;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinterTest {

    @Test
    public void linter_testGateFileReturnsList(){
        Linter linterApp = new Linter();

        assertTrue("Should Return 46", linterApp.linter("src/main/resources/gates.js") == 46);
    }

    @Test
    public void linter_testEmptyFile(){
        Linter linterApp = new Linter();

        assertTrue("Empty file should return 0", linterApp.linter("src/main/resources/empty.js") == 0);
    }

    @Test
    public void linter_testFewFile(){
        Linter linterApp = new Linter();

        assertTrue("Empty file should return 0", linterApp.linter("src/main/resources/few.js") == 5);
    }

    @Test
    public void linter_testManyFile(){
        Linter linterApp = new Linter();

        assertTrue("Empty file should return 0", linterApp.linter("src/main/resources/many.js") == 92);
    }

    @Test
    public void linter_testNoErrorFile(){
        Linter linterApp = new Linter();

        assertTrue("Empty file should return 0", linterApp.linter("src/main/resources/noerror.js") == 0);
    }
}