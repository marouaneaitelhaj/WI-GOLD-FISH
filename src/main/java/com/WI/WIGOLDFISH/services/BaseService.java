package com.WI.WIGOLDFISH.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseService<DTO_RSP, DTO_MINI, F>  {
    DTO_MINI save(DTO_MINI dtoMini);

    DTO_MINI update(DTO_MINI dtoMini, F f);

    Boolean delete(F f);

    DTO_RSP findOne(F f);

    Page<DTO_RSP> findAll(Pageable pageable);
}
