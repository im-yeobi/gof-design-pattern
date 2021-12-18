package com.example.gofdesignpattern.week04_builder.`02_패턴_적용_후`

import java.time.LocalDate


fun main() {

    val defaultTourBuilder = DefaultTourBuilder()
    val cancunTrip1 = defaultTourBuilder.title("칸쿤 여행")
        .nightsAndDays(2, 3)
        .startDate(LocalDate.of(2020, 12, 9))
        .whereToStay("리조트")
        .addPlan(0, "체크인하고 짐 풀기")
        .addPlan(0, "저녁식사")
        .getPlan()


    // 최종
    val tourDirector = TourDirector(DefaultTourBuilder())

    val cancunTrip = tourDirector.cancunTrip()
    val longBeachTrip = tourDirector.longBeachTrip()
}
