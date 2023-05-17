package pu.springdatajdbc.bo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jdbc.core.mapping.AggregateReference;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChessGame
{
private Long id;
private LocalDateTime playedOn;
private AggregateReference<ChessPlayer, Long> playerWhite;
private AggregateReference<ChessPlayer, Long> playerBlack;
private List<ChessMove> moves;

}
