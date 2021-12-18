package com.example.gofdesignpattern.week04_builder

class AnotherBankTransfer(
    override val fromBankCode: Int,
    override val toBankCode: Int,
    override val amount: Int,
    override val summary: String?,
    override val name: String
) : Transfer {
}
