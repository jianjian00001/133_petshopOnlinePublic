package com.dao;

import com.entity.ChongwuyongpinOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuyongpinOrderView;

/**
 * 商品订单 Dao 接口
 *
 * @author 
 */
public interface ChongwuyongpinOrderDao extends BaseMapper<ChongwuyongpinOrderEntity> {

   List<ChongwuyongpinOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
