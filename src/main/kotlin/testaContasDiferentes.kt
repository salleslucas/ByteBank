fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println()
    println("Saldo após depósito: ${contaCorrente.saldo}")
    println("Saldo após depósito: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println()
    println("Saldo após saque: ${contaCorrente.saldo}")
    println("Saldo após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    contaPoupanca.transfere(100.0, contaCorrente)
    println()
    println("Saldo após transferencia: ${contaCorrente.saldo}")
    println("Saldo após transferencia: ${contaPoupanca.saldo}")
}




