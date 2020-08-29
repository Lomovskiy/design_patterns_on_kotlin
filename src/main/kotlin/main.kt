fun main() {

    val bank = Bank()
    bank.accept(HtmlVisitor())
    bank.accept(XmlVisitor())
    bank.accept(JsonVisitor())

}
