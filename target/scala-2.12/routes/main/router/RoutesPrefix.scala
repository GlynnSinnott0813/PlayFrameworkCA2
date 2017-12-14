
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Ca2/CA2/conf/routes
// @DATE:Thu Dec 14 14:23:58 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
