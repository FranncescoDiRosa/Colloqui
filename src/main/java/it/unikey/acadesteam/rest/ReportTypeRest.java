package it.unikey.acadesteam.rest;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@RequiredArgsConstructor
public class ReportTypeRest {
    private Integer id;
    private String description;
    private Set<ReportRest> reports;
}
