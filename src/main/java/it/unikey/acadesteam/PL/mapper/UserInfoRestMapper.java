package it.unikey.acadesteam.PL.mapper;

import it.unikey.acadesteam.BLL.dto.UserInfoDto;
import it.unikey.acadesteam.rest.UserInfoRest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserInfoRestMapper {

    UserInfoRest fromDtoToRest(UserInfoDto dto);
    UserInfoDto fromRestToDto(UserInfoRest rest);

}
