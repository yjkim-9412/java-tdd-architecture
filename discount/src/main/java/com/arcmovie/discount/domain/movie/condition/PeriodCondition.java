package com.arcmovie.discount.domain.movie.condition;

import com.arcmovie.discount.domain.movie.Screening;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition{

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfyBy(Screening screening) {
        LocalDateTime screeningStartTime = screening.getStartTime();
        return screeningStartTime.getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screeningStartTime.toLocalTime()) <= 0 &&
                endTime.compareTo(screeningStartTime.toLocalTime()) >= 0 ;
    }
}
