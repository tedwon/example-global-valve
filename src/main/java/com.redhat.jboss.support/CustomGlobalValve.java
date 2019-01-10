package com.redhat.jboss.support;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.logging.Logger;

public class CustomGlobalValve extends ValveBase {

    private final static Logger LOGGER = Logger.getLogger(CustomGlobalValve.class.toString());

    private String output;

    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public void invoke(Request request, Response response) throws IOException, ServletException {
        response.setBufferSize(Integer.parseInt(this.output));
        LOGGER.info("res.setBufferSize(" + this.output + ");");
        getNext().invoke(request, response);
    }
}