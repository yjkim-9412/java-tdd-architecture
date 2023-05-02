package com.arcmovie.discount.domain.movie.condition;

import com.arcmovie.discount.domain.movie.Screening;

public class SequenceCondition implements DiscountCondition {

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfyBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
