open class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    //    ****   Construtor Secundário ****
//    constructor (titular: String,
//                 numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}