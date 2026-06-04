/*
 * Copyright (c) 2022 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in project root directory.
 */
package eu.mneifercons.examples.servlet;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleServletTest extends Mockito {

    @Test
    public void testResponse() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        when(response.getWriter()).thenReturn(pw);

        SimpleServlet servlet = new SimpleServlet();
        servlet.doGet(request, response);

        pw.flush();

        assertTrue(sw.toString()
                .contains("hello world"));
    }
}
