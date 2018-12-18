package com.hjw.patterns.structural.chain2;

import java.util.List;

public class RealChain implements Interceptor.Chain{
    private List<Interceptor> interceptors;
    private Request request;
    private int pos ;
    public RealChain(List<Interceptor> interceptors,Request request,int pos){
        this.interceptors = interceptors;
        this.request = request;
        this.pos = pos;
    }

    @Override
    public Request getRequest() {
        return request;
    }

    @Override
    public Response proceed(Request request) {
        RealChain realChain = new RealChain(interceptors,request,pos);
        Interceptor interceptor = interceptors.get(pos);
        return interceptor.intercept(realChain);
    }
}
