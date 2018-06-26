package org.spring.springboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderMstDetailDto {

    private Long id;//id
    private String orderNo;//订单号
    private Long uid;//uid
    private Long sid;//服务商id
    @NotNull(message = "服务商品id不能为空")
    private Long goodsId;//服务商品id
    @NotBlank(message = "服务商品名不能为空")
    private String goodsName;
    @NotBlank(message = "服务快照不能为空")
    private String goodsSkuInfo;//服务商品规格快照信息
    @NotNull(message = "服务规格id不能为空")
    private Long goodsSkuId;//服务商品规格快照信息
    private String appId;//当为开放平台自营服务时需要，其他服务此字段为空
    private BigDecimal price;//服务商品标价-单价
    private BigDecimal realPrice;//实际单价
    private Integer number;//数量
    private BigDecimal totalFee;//总价（实际付款）
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date createTime;//create_time
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date updateTime;//update_time

    @Override
    public String toString() {
        return "OrderMstDetailDto{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", uid=" + uid +
                ", sid=" + sid +
                ", goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsSkuInfo='" + goodsSkuInfo + '\'' +
                ", goodsSkuId=" + goodsSkuId +
                ", appId='" + appId + '\'' +
                ", price=" + price +
                ", realPrice=" + realPrice +
                ", number=" + number +
                ", totalFee=" + totalFee +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
