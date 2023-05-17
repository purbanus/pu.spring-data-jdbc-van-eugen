package pu.springdatajdbc.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * I copied this from another (forgotten) Eugen project
 */
public class ChessGame_OtherProject
{

@Id
private Long id;

@SuppressWarnings( "unused" )
private String playerWhite;

@SuppressWarnings( "unused" )
private String playerBlack;

@SuppressWarnings( "unused" )
private List<ChessMove> moves = new ArrayList<>();

// getter and setter methods
}