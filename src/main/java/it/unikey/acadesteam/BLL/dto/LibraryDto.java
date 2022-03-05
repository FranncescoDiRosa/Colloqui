package it.unikey.acadesteam.BLL.dto;

import lombok.Data;

@Data
public class LibraryDto {
    private Integer id;
    private UserInfoDto userInfo;
    private GameDto games;
}