package com.third.shopping.service;

import com.third.shopping.dao.CartDAO;
import com.third.shopping.dao.ItemDAO;
import com.third.shopping.model.entity.CartEntity;
import com.third.shopping.model.entity.MemberEntity;
import com.third.shopping.model.vo.CartInsert;
import com.third.shopping.model.vo.CartVO;
import com.third.shopping.model.vo.ItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    @Autowired
    MemberService memberService;
    @Autowired
    CartDAO cartDAO;
    @Autowired
    ItemDAO itemDAO;
    @Autowired
    ItemService itemService;


    public int insertCart(CartVO vo, Principal principal) {

        MemberEntity memberEntity = memberService.findPrincipal(principal);
        vo.setMem_idx(memberEntity.getMem_idx());
        return cartDAO.insertCart(vo);

    }

    public int upCount(CartVO vo) {
        return cartDAO.upCount(vo);
    }

    public int downCount(CartVO vo) {
        return cartDAO.downCount(vo);
    }

    public int deleteCartItem(CartVO vo) {
        return cartDAO.deleteCartItem(vo);
    }

    public int deleteAll(CartVO vo) {
        return cartDAO.deleteAll(vo);
    }

    /* 고치는 부분 */
/*    public List<CartListPageVO> cartListTest(CartListPageVO vo) {

        List<CartListPageVO> cList = cartDAO.cartListTest(vo);
        List<ItemVO> iList = itemDAO.

        for (int i = 0; i < cList.size(); i++) {
            CartListPageVO clvo = new CartListPageVO();

            System.out.println("cList 사이즈 : " + cList.size());
            System.out.println("cList get(i) : " + cList.get(i));
        }
        return cList;
    }*/

/*    public List<String> selectSrc(int item_idx) {
        return itemDAO.selectSrc(item_idx);
    }
    public List<String>  selectName(int item_idx) {
        return itemDAO.selectName(item_idx);
    }
    public List<String>  selectPrice(int item_idx) {
        return itemDAO.selectPrice(item_idx);
    }*/

    public List<CartVO> selectListCart(Principal principal) {
        MemberEntity memberEntity = memberService.findPrincipal(principal);

        List<CartEntity> cartEntityList = cartDAO.selectListCart(memberEntity.getMem_idx());
        System.out.println(memberEntity.getMem_idx());
        List<CartVO> cartVOList = new ArrayList<>();
        for (int i=0 ; i<cartEntityList.size();i++){

            cartVOList.add(cartEntityList.get(i).voChangeCart());
            ItemVO item = itemService.selectOneSrcOne(cartEntityList.get(i).getItem_idx());

            cartVOList.get(i).setItemVO(item);
        }

        return cartVOList;

    }

    public int cartInsertItem(CartInsert CartInsert, Principal principal) {

        MemberEntity memberEntity = memberService.findPrincipal(principal);
        CartInsert.setMem_idx(memberEntity.getMem_idx());
        return cartDAO.cartInsertItem(CartInsert);
    }

    public List<CartVO> cartoneselect(int mem_idx) {
        return cartDAO.cartoneselect(mem_idx);
    }

    public int deleteOne(int cart_idx) {
        return cartDAO.deleteOne(cart_idx);
    }
}
