package example

class ScalaLibrary {
  def run(): Unit = {
    println(mypackage.MyClassname.A.newBuilder().setA("hello").build().getA)
  }
}
