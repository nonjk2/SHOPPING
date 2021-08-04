package com.third.shopping.dao;

import com.third.shopping.model.entity.ItemEntity;
import com.third.shopping.model.vo.ItemVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("itemDao")
public class ItemDAO { 
	
	@Autowired
	SqlSession sqlsseion;
	
	public int insertItem(ItemVO vo){

		return sqlsseion.insert("i.insertItem", vo);
		
	}

	public ItemEntity selectOne(int item_idx) {
		
		return sqlsseion.selectOne("i.selectOne" , item_idx);
	}

	public List<ItemEntity> selectList() {
		
		return sqlsseion.selectList("i.selectList");
	}

	
	public int updateItem(ItemEntity entity) {
		
		return sqlsseion.insert("i.updateItem" , entity);
	}

	public int deleteItem(int idx) {
		
		
		return sqlsseion.delete("i.deleteItem" , idx);
	}

	public List<ItemEntity> itemPopList() {
		
		return sqlsseion.selectList("i.itemPopList");
	}

	public List<ItemEntity> itemPopList2() {

		return sqlsseion.selectList("i.itemPopList2");
	}

	public List<String> selectSrc(int item_idx) {
		return sqlsseion.selectList("i.imagelist", item_idx);
	}
	public String selectSrcOne(int item_idx) {
		return sqlsseion.selectOne("i.selectSrcOne", item_idx);
	}

	public List<ItemEntity> selectSecondList(int second_idx) {
		return sqlsseion.selectList("i.seconditemList", second_idx);
	}

	/*
	 * public Optional<Integer> NameConfirm(ItemVO vo){
	 * 
	 * return sqlsseion.selectOne("i.NameConfirm", vo);
	 * 
	 * }
	 */

}
