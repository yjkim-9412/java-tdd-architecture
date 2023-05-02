package com.arcmovie.discount.domain.movie.discountpolicy;

import com.arcmovie.discount.domain.movie.Money;
import com.arcmovie.discount.domain.movie.Screening;
import com.arcmovie.discount.domain.movie.condition.DiscountCondition;

import java.util.List;

public class PercentDiscountPolicy extends DiscountPolicy{

    private double percent;

    public PercentDiscountPolicy(List<DiscountCondition> conditions, double percent) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
