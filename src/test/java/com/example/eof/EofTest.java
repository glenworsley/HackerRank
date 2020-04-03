package com.example.eof;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class EofTest {

    @Test
    public void test1() throws IOException {

        String sampleString = "this is a simple line\nAnd this is the next line\n";
        InputStream inputStream = new ByteArrayInputStream(sampleString.getBytes());       
        int lineNumber = 0;

        final ByteArrayOutputStream outputStream = Mockito.mock(ByteArrayOutputStream.class);

        try (
            Scanner scanner = new Scanner(inputStream);
            
        ) {
            lineNumber++;
            String line = lineNumber + " " + scanner.nextLine();
            outputStream.write(line.getBytes());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        String expected = "1 this is a simple line";
        Mockito.verify(outputStream, Mockito.times(1)).write(expected.getBytes());

    }

}