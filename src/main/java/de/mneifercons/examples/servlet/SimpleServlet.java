/*
 * Copyright (c) 2020 Markus Neifer
 * Licensed under the MIT License.
 * See file LICENSE in parent directory of project root.
 */
package de.mneifercons.examples.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SimpleServlet extends HttpServlet {

    private static final long serialVersionUID = 291895483502440911L;

    final Logger logger = LoggerFactory.getLogger(SimpleServlet.class);

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/plain; charset=utf-8");

            PrintWriter out = response.getWriter();
            out.println("hello world");
        } catch (IllegalStateException | UnsupportedEncodingException e) {
            logger.error("Exception thrown", e);
        }
    }
}
