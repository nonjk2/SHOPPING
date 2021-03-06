package com.third.shopping.model.vo;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Alias("CartVO")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartVO {
    private int cart_idx;
    private int mem_idx;
    private int itemcount;

    private ItemVO itemVO;

}
