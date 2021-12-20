package bowling.domain.state.end;

import bowling.domain.Pitch;
import bowling.domain.Score;
import bowling.domain.frame.Frame;
import bowling.domain.state.State;

public abstract class End implements State {
    protected static final String STRIKE_SYMBOL = "X";
    protected static final String SPARE_SYMBOL = "/";
    protected static final String OR = "|";

    @Override
    public State run(Pitch pitch, Frame frame) {
        throw new IllegalArgumentException("종료된 프레임 입니다.");
    }

    @Override
    public boolean progressing() {
        return false;
    }

    @Override
    public boolean retryable() {
        return false;
    }

    @Override
    public String toString() {
        return "End{}";
    }

    abstract Score score();
    abstract Score calculateBonusScore(Score beforeScore);
    abstract String symbol();
}
