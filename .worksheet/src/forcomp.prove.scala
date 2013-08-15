package forcomp
import Anagrams._
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Occurs
object prove {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(343); 

//val w="Olindo".map(_.toLower)

//msort(wordOccurrences("Robert")) sortBy (x=>x._1)
 
  //w.groupBy(_.toChar)
//val s = List("Viva","la","Foca","che","dio","la","benedoca")
 //s mkString
//mergeSentences(s)
 val m=Map(3->"pippo");System.out.println("""m  : scala.collection.immutable.Map[Int,String] = """ + $show(m ));$skip(41); 
 val z= m + (4->"pluto") + (3->"faluto");System.out.println("""z  : scala.collection.immutable.Map[Int,String] = """ + $show(z ));$skip(18); 
 val t = m ++ (z);System.out.println("""t  : scala.collection.immutable.Map[Int,String] = """ + $show(t ));$skip(509); 
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
val y=wordOccurrences("assess");System.out.println("""y  : forcomp.Anagrams.Occurrences = """ + $show(y ));$skip(48); 
//val mx=x groupBy(_._1)
val my=y groupBy(_._1);System.out.println("""my  : scala.collection.immutable.Map[Char,List[(Char, Int)]] = """ + $show(my ));$skip(60); 

 //val ang=List("I", "love", "you")
 val ang=List("pippo");System.out.println("""ang  : List[String] = """ + $show(ang ));$skip(87); 
 //subtract(x, y)
 val tot=combinations(sentenceOccurrences(List("I", "love", "you")));System.out.println("""tot  : List[forcomp.Anagrams.Occurrences] = """ + $show(tot ));$skip(40); val res$0 = 
 //tot map (println(_))
 List(Nil)==Nil;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(23); val res$1 = 
 sentenceAnagrams(ang);System.out.println("""res1: List[forcomp.Anagrams.Sentence] = """ + $show(res$1))}
                                                 
}
