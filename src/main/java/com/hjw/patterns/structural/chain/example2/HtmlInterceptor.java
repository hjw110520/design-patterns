package com.hjw.patterns.structural.chain.example2;

public class HtmlInterceptor implements Interceptor{
    @Override
    public Response intercept(Chain chain) {
        Request request = chain.getRequest();
        String req = request.getReq();
        request.setReq(req.replaceAll("html",""));
        return chain.proceed(request);
    }
}
