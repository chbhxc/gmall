package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SkuImagesEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku图片
 *
 * @author chbh
 * @email chbh@atguigu.com
 * @date 2020-02-18 18:51:09
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

