package pu.springdatajdbc.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class ChessGame
{

@Id
private Long id;

private String playerWhite;

private String playerBlack;

private List<ChessMove> moves = new ArrayList<>();

// getter and setter methods
}