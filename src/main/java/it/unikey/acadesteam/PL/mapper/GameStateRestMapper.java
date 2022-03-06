package it.unikey.acadesteam.PL.mapper;

import it.unikey.acadesteam.BLL.dto.GameStateDto;
import it.unikey.acadesteam.rest.GameStateRest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GameStateRestMapper {

    GameStateDto fromGameStateRestToGameDto(GameStateRest rest);
    GameStateRest fromGameStateDtoToGameRest(GameStateDto dto);
}
