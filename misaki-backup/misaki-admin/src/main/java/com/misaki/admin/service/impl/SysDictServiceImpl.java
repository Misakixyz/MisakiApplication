package com.misaki.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misaki.admin.dao.SysDictMapper;
import com.misaki.admin.model.SysDict;
import com.misaki.admin.service.SysDictService;
import com.misaki.core.page.MybatisPageHelper;
import com.misaki.core.page.PageRequest;
import com.misaki.core.page.PageResult;

@Service
public class SysDictServiceImpl  implements SysDictService {

	@Autowired(required = false)
	private SysDictMapper sysDictMapper;

	@Override
	public int save(SysDict record) {
		if(record.getId() == null || record.getId() == 0) {
			return sysDictMapper.insertSelective(record);
		}
		return sysDictMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int delete(SysDict record) {
		return sysDictMapper.deleteByPrimaryKey(record.getId());
	}

	@Override
	public int delete(List<SysDict> records) {
		for(SysDict record:records) {
			delete(record);
		}
		return 1;
	}

	/**
	 * 根据ID查询
	 *
	 * @param id
	 */
	@Override
	public SysDict findByID(Long id) {
		return null;
	}

	@Override
	public SysDict findById(Long id) {
		return sysDictMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		Object label = pageRequest.getParam("label");
		if(label != null) {
			return MybatisPageHelper.findPage(pageRequest, sysDictMapper, "findPageByLabel", label);
		}
		return MybatisPageHelper.findPage(pageRequest, sysDictMapper);
	}

	@Override
	public List<SysDict> findByLable(String lable) {
		return sysDictMapper.findByLable(lable);
	}

}
