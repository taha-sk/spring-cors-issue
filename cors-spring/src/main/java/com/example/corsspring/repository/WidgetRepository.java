package com.example.corsspring.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.corsspring.model.Widget;

public interface WidgetRepository extends PagingAndSortingRepository<Widget, Long> {

}
