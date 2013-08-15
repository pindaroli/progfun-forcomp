package forcomp

object nqueens {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(326); 
  def queen(n: Int): Set[List[Int]] = {
    def placeQueens(k: Int): Set[List[Int]] =
      if (k == 0) Set(List())
      else
        for {
          queens <- placeQueens(k - 1)
          col <- 0 until n
          if isSafe(col, queens)
        } yield col :: queens
    placeQueens(n)
  };System.out.println("""queen: (n: Int)Set[List[Int]]""");$skip(228); 
  
  def isSafe(col:Int, queens: List[Int]):Boolean = {
   val row = queens.length
   val queensWithRow =(row -1 to 0 by -1) zip queens
   queensWithRow forall {
    case (r,c) => col !=c && math.abs(col - c) != row -r
   }
  };System.out.println("""isSafe: (col: Int, queens: List[Int])Boolean""")}
}
