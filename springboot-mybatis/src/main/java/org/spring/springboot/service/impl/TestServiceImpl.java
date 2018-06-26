package org.spring.springboot.service.impl;

import brother_sky.common.BrotherSkyCommon;
import brother_sky.common.BrotherSkyContents;
import brother_sky.po.BrotherSkyInsertPo;
import brother_sky.po.BrotherSkyQueryPo;
import org.spring.springboot.dao.BrotherSkyDao;
import org.spring.springboot.domain.OrderMstDetailDto;
import org.spring.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TestServiceImpl implements TestService {

    @Autowired
    private BrotherSkyDao brotherSkyDao;

    public void testInsert(){
        Map<String,Object> insertMap = new HashMap<String, Object>();
        insertMap.put("uid","10086");
        insertMap.put("order_no","zlyan110");
        insertMap.put("create_time",new Date());
        BrotherSkyInsertPo sky = new BrotherSkyInsertPo();
        sky.setInsertObjectMap(insertMap);
        sky.setInsertTable("order_mst_detail");
        brotherSkyDao.britherSkyInsert(sky.getSQlParamMap());
    }


    public void search(){
        BrotherSkyQueryPo sky = new BrotherSkyQueryPo();
        sky.setSelectColoumn(" * ");
        sky.setFromTable("order_mst_detail");
        //条件添加
        sky.addWhereValue(" order_no = ? ", new String[]{"order_no"}, new Object[]{"1309376678298583"});
        //获取客户结果
        LinkedHashMap<String,Object> result = brotherSkyDao.brotherSkySingleSearch(sky.getSQlParamMap());
        OrderMstDetailDto order = BrotherSkyCommon.mapToBean(result,new OrderMstDetailDto(), BrotherSkyContents.TYPE_LINE_TO_HUMP);
        System.out.println(order.toString());
    }

    public void searchList(){
        BrotherSkyQueryPo sky = new BrotherSkyQueryPo();
        sky.setSelectColoumn(" * ");
        sky.setFromTable("order_mst_detail");
        //条件添加
        sky.addWhereValue(" order_no = ? ", new String[]{"order_no"}, new Object[]{"1121518638813576"});
        sky.addWhereValue(" or order_no = ? ", new String[]{"order_no"}, new Object[]{"1309376678298583"},BrotherSkyContents.OR);

        //sky.addWhereValue(" order_no in (?) ",new String[]{"order_no"},new Object[]{new String[]{"1309376678298583","1121518638813576"}},BrotherSkyContents.IN);
        //获取客户结果
        List<LinkedHashMap<String,Object>> result = brotherSkyDao.brotherSkySearch(sky.getSQlParamMap());
        List<OrderMstDetailDto> list = BrotherSkyCommon.getResultList(result,OrderMstDetailDto.class,BrotherSkyContents.TYPE_LINE_TO_HUMP);
        //总记录数
        long total = brotherSkyDao.getTotalNum(sky.getTotalSQLParamMap());
    }
}
