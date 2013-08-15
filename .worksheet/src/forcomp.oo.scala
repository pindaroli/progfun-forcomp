package forcomp

object oo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(45); val res$0 = 
  List(Nil)==Nil;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(14); val res$1 = 
  List()==Nil;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(78); 
  for (i <- 1 to 2) {
  for (j <- 1 to 2)
    yield (i, j)  } map(println(_));$skip(80); val res$2 = 
    
   ( for (
  i <- 1 to 2;
  j <- 1 to 2
) yield (i, j) )   map(println(_));System.out.println("""res2: scala.collection.immutable.IndexedSeq[Unit] = """ + $show(res$2))}
    
}