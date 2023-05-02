package com.arcmovie.discount.domain.movie.discountpolicy;

import com.arcmovie.discount.domain.movie.Money;
import com.arcmovie.discount.domain.movie.Screening;

public class NoneDiscountPolicy implements DiscountPolicy{
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
