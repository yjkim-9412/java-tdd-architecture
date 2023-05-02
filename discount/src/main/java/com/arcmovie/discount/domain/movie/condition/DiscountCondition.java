package com.arcmovie.discount.domain.movie.condition;

import com.arcmovie.discount.domain.movie.Screening;

public interface DiscountCondition {
    boolean isSatisfyBy(Screening screening);
}
