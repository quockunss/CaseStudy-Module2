package com.codegym.cms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.codegym.cms.model.Province;

public interface ProvinceRepository extends PagingAndSortingRepository<Province,Long> {
}
