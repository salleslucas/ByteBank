fun main() {
    println("Bem Vindo ao ByteBank")
    for (i in 1..5) {
        val titular: String = "Lucas$i"
        println(titular)
    }
    println()
    for (i in 5 downTo 1) {
        val titular: String = "Lucas$i"
        println(titular)
    }
    println()
    for (i in 5 downTo 1 step 2) {
        val titular: String = "Lucas$i"
        println(titular)
    }
    println()
    var i = 0
    while (i < 5) {
        val titular: String = "Lucas$i"
        println("Titular $titular")
        i++
    }

    val contaAlex = Conta(titular = "Alex",numero =  1000)
    contaAlex.deposito(400.0)

    val contaFran = Conta(titular = "Fran", numero = 1001)
    contaFran.deposito(500.0)

    println("Titular da Conta: ${contaAlex.titular}")
    println("Número da Conta: ${contaAlex.numero}")
    println("Saldo: R$${contaAlex.saldo}")
    println()
    println("Titular da Conta: ${contaFran.titular}")
    println("Número da conta: ${contaFran.numero}")
    println("Saldo: R$${contaFran.saldo}")
    println()

    println("Depósito na conta do Alex:")
    contaAlex.deposito(50.0)
    println(contaAlex.saldo)
    println()
    println("Depósito na conta da Fran:")
    contaFran.deposito(100.0)
    println(contaFran.saldo)
    println()
    println("Saque na conta do Alex:")
    contaAlex.saque(valor = 50.0)
    println(contaAlex.saldo)
    println()
    println("Saque na conta da Fran:")
    contaFran.saque(valor = 100.0)
    println(contaFran.saldo)

    println()
    println("Transferência da conta da Fran para o Alex:")
    if (contaFran.transfer(200.0, contaAlex)) {
        println("Transferência Concluída")
    } else {
        println("Falha na Transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}

class Conta (var titular: String,
             val numero: Int){
    var saldo = 0.0
        private set

//    ****   Construtor Secundário ****
//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }


    fun deposito(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saque(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfer(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

//    **** Função get e setter ****
//    fun getSaldo(): Double{
//        return saldo
//    }
//    fun setSaldo(valor: Double){
//        if(valor > 0){
//            saldo = valor
//        }
//    }
}

