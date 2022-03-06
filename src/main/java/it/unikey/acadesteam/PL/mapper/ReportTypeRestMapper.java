package it.unikey.acadesteam.PL.mapper;

import it.unikey.acadesteam.BLL.dto.ReportTypeDto;
import it.unikey.acadesteam.rest.ReportTypeRest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReportTypeRestMapper {
    ReportTypeRest fromDtoToRest(ReportTypeDto dto);
    ReportTypeDto fromRestToDto(ReportTypeRest rest);
}
