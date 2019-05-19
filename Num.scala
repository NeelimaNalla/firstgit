object num_match
{
def main (args:Array[String])
{
def matchNum(x:Int):String=x match
{
case i if i % 2 == 0 =>"one"
case i if i%2 ==1 =>"two"
case _ =>"greate output"
 }
val List1 =List(1,2,3,4)
for(i<-List1)
println(matchNum(i))
 }
}
