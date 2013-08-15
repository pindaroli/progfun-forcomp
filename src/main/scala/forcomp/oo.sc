package forcomp

object oo {
  List(Nil)==Nil                                  //> res0: Boolean = false
  List()==Nil                                     //> res1: Boolean = true
  for (i <- 1 to 2) {
  for (j <- 1 to 2)
    yield (i, j)  } map(println(_))               //> (1,1)
                                                  //| (1,2)
                                                  //| (2,1)
                                                  //| (2,2)
    
   ( for (
  i <- 1 to 2;
  j <- 1 to 2
) yield (i, j) )   map(println(_))                //> (1,1)
                                                  //| (1,2)
                                                  //| (2,1)
                                                  //| (2,2)
                                                  //| res2: scala.collection.immutable.IndexedSeq[Unit] = Vector((), (), (), ())
    
}