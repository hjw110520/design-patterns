package com.hjw.patterns.structural.chain.example2;

public interface Interceptor {
    Response intercept(Chain chain);

    public interface Chain{
        Request getRequest();
        public Response proceed(Request request);
    }
}
