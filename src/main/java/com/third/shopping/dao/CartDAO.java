package com.third.shopping.dao;

import com.third.shopping.model.entity.CartEntity;
import com.third.shopping.model.vo.CartInsert;
import com.third.shopping.model.vo.CartVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cartDao")
public class CartDAO {

    @Autowired
    SqlSession sqlSession;

    public int cartInsertItem(CartInsert cartInsert) {

        return sqlSession.insert("c.cartInsertItem", cartInsert);
    }


    /* 장바구니 목록*/
/*    public List<CartVO> cartList() {
        return sqlSession.selectList("c.cartList");
    }*/

    /* 장바구니에 아이템 추가 */
    public int insertCart(CartVO vo) {
        return sqlSession.insert("c.insertCart", vo);
    }

    /* itemcount 1씩 증가 */
    public int upCount(CartVO vo){
        return sqlSession.update("c.upCount", vo);
    }

    /* itemcount 감소 */
    public int downCount(CartVO vo) {
        return sqlSession.update("c.downCount", vo);
    }

    /* 장바구니에 아이템 삭제 */
    public int deleteCartItem(CartVO vo) {
        return sqlSession.delete("c.deleteCartItem", vo);
    }

    /* 장바구니 비우기 */
    public int deleteAll(CartVO vo) {
        return sqlSession.delete("c.deleteAll", vo);
    }

    /* src 가져오기 */
/*    public String selectSrc(int item_idx) {
        return sqlSession.selectOne("c.selectSrc", item_idx);
    }*/

    public List<CartEntity> selectListCart(int mem_idx) {
        return sqlSession.selectList("c.selectListCart", mem_idx);
    }

    /* item 가져오기 */

    public int CartInsertItem(CartVO jangVO1) {
        System.out.println(jangVO1.getMem_idx());
        System.out.println(jangVO1.getItemcount());
        return sqlSession.insert("c.cartInsertItem",jangVO1);
    }

    public List<CartVO> cartoneselect(int mem_idx) {
        return sqlSession.selectList("c.cartoneselect",mem_idx);
    }

    public int deleteOne(int cart_idx) {
        return sqlSession.delete("c.deleteOne",cart_idx);
    }
}


