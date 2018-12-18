package com.hjw.patterns.structural.chain;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new XiaoMingInterceptor());
        interceptors.add(new ManagerInterceptor());
        interceptors.add(new BossInterceptor());
        RealChain realChain  = new RealChain(interceptors,null,0);
        List<DocApproval> docApprovalList = realChain.proceed(new DocApproval("hjw","please pass"));
        for (int i=0;i<docApprovalList.size();i++){
            System.out.println("step"+i+":"+docApprovalList.get(i).toString());
        }
    }
}
