interface Account {

    fun accept(visitor: Visitor)

}

class PersonAccount : Account {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

}

class CompanyAccount : Account {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

}

class MultiAccount : Account {

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

}

interface Visitor {

    fun visit(account: Account)

}

class HtmlVisitor : Visitor {

    override fun visit(account: Account) {
        println("${account}, $this")
    }

}

class XmlVisitor : Visitor {

    override fun visit(account: Account) {
        println("${account}, $this")
    }

}

class JsonVisitor : Visitor {

    override fun visit(account: Account) {
        println("${account}, $this")
    }

}

class Bank {

    private val accounts: ArrayList<Account> = ArrayList()

    init {
        accounts.add(PersonAccount())
        accounts.add(CompanyAccount())
        accounts.add(MultiAccount())
    }

    fun accept(visitor: Visitor) {
        accounts.forEach { account: Account ->
            account.accept(visitor)
        }
    }

}