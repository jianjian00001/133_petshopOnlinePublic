package com.dao;

import com.entity.ChongwuyongpinCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuyongpinCollectionView;

/**
 * 商品收藏 Dao 接口
 *
 * @author 
 */
public interface ChongwuyongpinCollectionDao extends BaseMapper<ChongwuyongpinCollectionEntity> {

   List<ChongwuyongpinCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
