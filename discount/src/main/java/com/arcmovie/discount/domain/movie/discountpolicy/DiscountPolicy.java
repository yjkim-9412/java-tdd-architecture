package com.arcmovie.discount.domain.movie.discountpolicy;

import com.arcmovie.discount.domain.movie.Money;
import com.arcmovie.discount.domain.movie.Screening;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
