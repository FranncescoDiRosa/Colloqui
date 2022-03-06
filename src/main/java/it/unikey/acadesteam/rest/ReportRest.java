package it.unikey.acadesteam.rest;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class ReportRest {
    private Integer id;
    private LocalDate date;
    private String description;
    private ReportTypeRest reportType;
    private GameRest game;
    private UserInfoRest userInfo;
}