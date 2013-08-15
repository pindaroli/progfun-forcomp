package forcomp
import forcomp.Anagrams._
object Test2 extends App {
val ang=List("heather","heather","i")
var i=0;
 sentenceAnagrams(ang).map(x=>{i=i+1;println(x+" "+i)})
}