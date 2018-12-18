package com.hjw.patterns.structural.chain;

import java.util.ArrayList;
import java.util.List;

public class RealChain implements Interceptor.Chain {
    List<Interceptor>  interceptorList;
    List<DocApproval> docApprovalList;
    int pos;
    public RealChain(List<Interceptor>  interceptorList,List<DocApproval>docApprovalList,int index){
        this.interceptorList = interceptorList;
        this.docApprovalList = docApprovalList;
        this.pos = index;
    }

    @Override
    public List<DocApproval> getDocApprovalList() {
        return docApprovalList;
    }

    @Override
    public List<DocApproval> proceed(DocApproval docApproval) {
        if(null == docApprovalList){
            docApprovalList = new ArrayList<>();
        }
        docApprovalList.add(docApproval);

        if(pos == interceptorList.size()){
            return docApprovalList;
        }

        RealChain next = new RealChain(interceptorList,docApprovalList,pos+1);
        Interceptor interceptor = interceptorList.get(pos);
        return interceptor.intercept(next);
    }
}
