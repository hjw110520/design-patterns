package com.hjw.patterns.structural.chain2;

public class HtmlInterceptor implements Interceptor{
    @Override
    public Response intercept(Chain chain) {
        Request request = chain.getRequest();
        String req = request.getReq();
        request.setReq(req.replaceAll("html","HTML"));
        return chain.proceed(request);
    }
}
