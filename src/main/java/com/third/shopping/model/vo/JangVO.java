package com.third.shopping.model.vo;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Alias("JangVO")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JangVO {

    private int cart_idx;
    private int mem_idx;
    private int item_idx;
    private int itemcount;
}
