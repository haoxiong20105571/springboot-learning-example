package org.spring.springboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderMstDto {

    private Long id;//非业务主键
    private String order_no;//订单号
    private Long uid;//uid
    private BigDecimal total_fee;//总价（实际付款）
    private String pay_type;//付款形式（1余额，2微信，3支付宝，4网银）
    private Integer is_fav;//是否使用优惠
    private Integer is_invoice;//是否需要发票
    private String remark;//备注说明
    private Long status;//订单状态(还要产品进一步明确)
    private Integer is_delete;//是否删除
    private Long address_id;//地址id
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date order_date;//订单时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date pay_date;//付款时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date finish_date;//交付完成时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date create_time;//创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date update_time;//结束时间
}
