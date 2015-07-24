package org.chodavarapu.datamill.http.impl;

import org.chodavarapu.datamill.http.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Ravi Chodavarapu (rchodava@gmail.com)
 */
public class RequestImpl implements Request {
    private final HttpServletRequest request;

    public RequestImpl(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public RequestEntity entity() {
        return new RequestEntityImpl(request);
    }

    @Override
    public ResponseBuilder respond() {
        return new ResponseBuilderImpl();
    }

    @Override
    public MethodMatcher method() {
        return new MethodMatcherImpl(this);
    }

    @Override
    public HttpServletRequest servletRequest() {
        return request;
    }

    @Override
    public UriMatcher<Response> uri() {
        return null;
    }
}
