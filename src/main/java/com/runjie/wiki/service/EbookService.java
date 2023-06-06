package com.runjie.wiki.service;

import com.runjie.wiki.domain.Ebook;
import com.runjie.wiki.domain.EbookExample;
import com.runjie.wiki.mapper.EbookMapper;
import com.runjie.wiki.req.EbookReq;
import com.runjie.wiki.resp.EbookResp;
import com.runjie.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria= criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebooksList = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList = new ArrayList<>();
//        for (Ebook ebook : ebooksList) {
////            EbookResp ebookResp = new EbookResp();
//////            ebookResp.setId(ebook.getId());
////            //实现对象的复制
////            BeanUtils.copyProperties(ebook, ebookResp);
//
////          实现copyutil封装beanUtil后:
//            对象复制
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        }

        //列表复制
        List<EbookResp> List = CopyUtil.copyList(ebooksList, EbookResp.class);

//        return respList;
        return List;
    }
}
