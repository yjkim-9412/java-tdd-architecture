package com.arcmovie.discount.domain.movie.discountpolicy;

import com.arcmovie.discount.domain.movie.Money;
import com.arcmovie.discount.domain.movie.Screening;
import com.arcmovie.discount.domain.movie.condition.DiscountCondition;

import java.util.ArrayList;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(List<DiscountCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each: conditions) {
            if (each.isSatisfyBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
