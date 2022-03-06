package it.unikey.acadesteam.rest;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@RequiredArgsConstructor

public class GameRest {
    private Integer id;
    private String gameTitle;
    private String gamePath;
    private GameStateRest gameState;
    private Set<ReportRest> reports;
    private Set<LibraryRest> library;
    private UserInfoRest developer;
    //private Set<ReviewRest> reviews;
}
