package com.third.shopping.model.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Alias("JangEntity")
@Getter
@Setter
@Builder
public class JangEntity {

    private int cart_idx;
    private int mem_idx;
    private int item_idx;
    private int itemcount;
}
