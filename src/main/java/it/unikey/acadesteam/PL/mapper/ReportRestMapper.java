package it.unikey.acadesteam.PL.mapper;

import it.unikey.acadesteam.BLL.dto.ReportDto;
import it.unikey.acadesteam.rest.ReportRest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReportRestMapper {
    ReportRest fromDtoToRest(ReportDto dto);
    ReportDto fromRestToDto(ReportRest rest);
}
