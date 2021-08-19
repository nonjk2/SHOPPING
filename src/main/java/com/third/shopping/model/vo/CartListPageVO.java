package com.third.shopping.model.vo;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("CartListPageVO")
@Setter
@Getter
public class CartListPageVO {

    private CartVO cartVO;
    private List<ItemVO> itemListVO;



}
