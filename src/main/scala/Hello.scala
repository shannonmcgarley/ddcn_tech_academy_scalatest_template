object chromosomeCrossover extends App {

  def crossing(Chrome1 : String, Chrome2 : String, Index : Int) : (String, String) ={
   val Chrome1Head = Chrome1.substring(0,Index)
    val Chrome1Tail = Chrome1.substring(Index,Chrome1.length)
    val Chrome2Head = Chrome2.substring(0,Index)
    val Chrome2Tail = Chrome2.substring(Index,Chrome2.length)
    val Chrome1Cross = Chrome1Head+Chrome2Tail
    val Chrome2Cross = Chrome2Head+Chrome1Tail
    (Chrome1Cross, Chrome2Cross)
  }

}
//Chrome1.substring()