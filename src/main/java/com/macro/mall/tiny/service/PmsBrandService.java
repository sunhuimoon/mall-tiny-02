package com.macro.mall.tiny.service;


import com.macro.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * PmsBrandService
 * 添加Service接口
 * Created by macro on 2019/4/19.
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
