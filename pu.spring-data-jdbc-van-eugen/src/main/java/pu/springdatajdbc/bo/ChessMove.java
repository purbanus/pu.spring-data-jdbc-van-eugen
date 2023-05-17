package pu.springdatajdbc.bo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChessMove
{
private Integer moveNumber;
private /*MoveColor*/ String color;
private String move;
void effe()
{
	getMove();
}
}
