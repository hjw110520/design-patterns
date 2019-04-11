package com.hjw.patterns.structural.chain.example2;

public class UpperCaseInterceptor implements Interceptor{
    @Override
    public Response intercept(Chain chain) {
        Request request = chain.getRequest();
        String req = request.getReq();
        request.setReq(req.toUpperCase());
        return chain.proceed(request);
    }
}
