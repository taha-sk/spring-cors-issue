package com.example.corsspring.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.corsspring.model.Widget;

@CrossOrigin
public interface WidgetRepository extends PagingAndSortingRepository<Widget, Long> {

}
