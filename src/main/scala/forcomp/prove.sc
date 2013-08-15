package forcomp
import Anagrams._
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Occurs
object prove {

//val w="Olindo".map(_.toLower)

//msort(wordOccurrences("Robert")) sortBy (x=>x._1)
 
  //w.groupBy(_.toChar)
//val s = List("Viva","la","Foca","che","dio","la","benedoca")
 //s mkString
//mergeSentences(s)
 val m=Map(3->"pippo")                            //> m  : scala.collection.immutable.Map[Int,String] = Map(3 -> pippo)
 val z= m + (4->"pluto") + (3->"faluto")          //> z  : scala.collection.immutable.Map[Int,String] = Map(3 -> faluto, 4 -> plut
                                                  //| o)
 val t = m ++ (z)                                 //> t  : scala.collection.immutable.Map[Int,String] = Map(3 -> faluto, 4 -> plut
                                                  //| o)
//val d=dictionaryByOccurrences
//for ( e <- dictionaryByOccurrences ) yield e
//val occ=(dictionaryByOccurrences head)._1
///def genComb(o: Occurrences):List[Occurrences]={
//val c=List(('a', 2), ('b', 2))
//val com=combinations(c)
//c.foldLeft(0)((b,x)=>x._2+b)
//c map (x=>x._1)
//clean(com)
//c groupBy(_._1)
//assessment - assess
//val x:Occurrences = List(('a', 1), ('d', 1), ('l', 1), ('r', 1))
//val y:Occurrences = List(('r', 1))
//val x=wordOccurrences("assessment")
val y=wordOccurrences("assess")                   //> java.lang.NoSuchMethodError: scala.Predef$.augmentString(Ljava/lang/String;)
                                                  //| Lscala/collection/immutable/StringOps;
                                                  //| 	at forcomp.Anagrams$.wordOccurrences(Anagrams.scala:38)
                                                  //| 	at forcomp.prove$$anonfun$main$1.apply$mcV$sp(forcomp.prove.scala:31)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at forcomp.prove$.main(forcomp.prove.scala:4)
                                                  //| 	at forcomp.prove.main(forcomp.prove.scala)
//val mx=x groupBy(_._1)
val my=y groupBy(_._1)

 //val ang=List("I", "love", "you")
 val ang=List("pippo")
 //subtract(x, y)
 val tot=combinations(sentenceOccurrences(List("I", "love", "you")))
 //tot map (println(_))
 List(Nil)==Nil
 sentenceAnagrams(ang)
                                                 
}