package com.memorious.back.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class ChartGraphDataReqDto {
    private List<Integer> userList;
    private LocalDate startDate;
}
