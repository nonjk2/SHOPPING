package com.third.shopping.model.vo;


import lombok.*;
import org.apache.ibatis.type.Alias;

@Alias("CartInsert")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartInsert {
    private int cart_idx;
    private int mem_idx;
    private int itemcount;
    private int item_idx;
}
