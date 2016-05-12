package com.cg.mapper;

import com.cg.domain.Hotel;

/**
 * Created by rocky on 2016/5/12.
 */
public interface HotelMapper {

    Hotel selectByCityId(int cityId);
}
