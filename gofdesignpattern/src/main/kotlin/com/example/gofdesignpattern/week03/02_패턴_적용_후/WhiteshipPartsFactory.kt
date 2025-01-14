package com.example.gofdesignpattern.week03.`02_패턴_적용_후`


import com.example.gofdesignpattern.week03.`01_패턴_적용_전`.WhiteWheel
import com.example.gofdesignpattern.week03.`01_패턴_적용_전`.WhiteAnchor

class WhiteshipPartsFactory : ShipPartFactory{
    override fun createAnchor() = WhiteAnchor()

    override fun createWheel() = WhiteWheel()
}
