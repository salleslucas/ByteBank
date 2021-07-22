fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "123.123.132-20",
        salario = 1000.0,
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao}")
    println()

    val lucas = Gerente(
        nome = "Lucas",
        cpf = "123.123.123-12",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${lucas.nome}")
    println("cpf ${lucas.cpf}")
    println("salario ${lucas.salario}")
    println("bonificacao ${lucas.bonificacao}")
    if (lucas.autenticacao(1234)){
        println("Autenticação com Sucesso!")
    }else
        println("Falha na Autenticação!")
    println()

    val lorran = Diretor(
        nome = "Lorran",
        cpf = "111.111.111-22",
        salario = 5000.0,
        senha = 5000,
        plr = 500.0,

    )

    println("nome ${lorran.nome}")
    println("cpf ${lorran.cpf}")
    println("salario ${lorran.salario}")
    println("bonificacao ${lorran.bonificacao}")
    println("plr: ${lorran.plr}")
    if (lorran.autenticacao(5000)){
        println("Autenticação com Sucesso!")
    }else
        println("Falha na Autenticação!")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(lucas)
    calculadora.registra(lorran)
    println()
    println("Total de bonificação= ${calculadora.total}")
}






