package it.unikey.acadesteam.PL.mapper;

import it.unikey.acadesteam.BLL.dto.RolesDto;
import it.unikey.acadesteam.rest.RolesRest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RolesRESTMapper {
    RolesRest fromRolesDtoToRolesRest(RolesDto entity);
    RolesDto fromRolesRestToRolesDto(RolesRest dto);
}
