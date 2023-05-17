package pu.springdatajdbc.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
/**
 * I copied this from another (forgotten) Eugen project
 */
public class ChessGame_OtherProject
{

@Id
private Long id;

private String playerWhite;
private String playerBlack;
private final List<ChessMove> moves = new ArrayList<>();

// getter and setter methods
}

//private LocalDateTime playedOn;
//private AggregateReference<ChessPlayer, Long> playerWhite;
//private AggregateReference<ChessPlayer, Long> playerBlack;


